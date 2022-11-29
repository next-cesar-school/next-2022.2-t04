import './App.css';
import React, { useState } from 'react';
import axios from "axios";

function App() {
  const [translationText, setTranslationText] = useState("")
  const [translatedText, setTranslatedText] = useState("")
  const [file, setFile] = useState(null)
  const [transcriptionText, setTranscriptionText] = useState("")

  const handleOnChange = (e) => {
    setTranslationText(e.target.value)
  }

  const handleOnChangeFile = (e) => {
    setFile(e.target.files[0])
  }

  const handleOnSubmitFile = () => {
    const formData = new FormData();
    formData.append("file", file)
    axios.post(`http://localhost:8080/upload/arquivo/en`, formData, {
      headers: {
        'Content-Type': 'multipart/form-data'
      }
    })
    .then(result => {
      const data = JSON.parse(JSON.stringify(result.data))
      console.log(data)
      console.log(data["traduction"])
      console.log(data['"traduction"'])
     setTranscriptionText(JSON.parse(JSON.stringify(result.data)).traduction) 
   })
}  

  const handleOnSubmit = () => {
       console.log(translationText)
       axios.get(`http://localhost:8080/toenglish/${translationText}`,)
       .then(result => {
        console.log(result.data)
        setTranslatedText(result.data)
      })
  }
  return (
    <div className="App">
      <header className="App-header">
        <div className="mb-3">
        <label  for="exampleFormControlTextarea1" className="form-label">Example textarea</label>
        <textarea value={translationText} onChange={handleOnChange} className="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
        </div>

        <button onClick={handleOnSubmit} type="button" className="btn btn-light">Traduzir</button>

        <p>{translatedText}</p>
        <div className="mb-3">
          <label for="formFile" className="form-label">Default file input example</label>
          <input onChange={handleOnChangeFile} className="form-control" type="file" id="formFile"/>
          <button onClick={handleOnSubmitFile} type="button" className="btn btn-light">Transcrição</button>
          <p>{transcriptionText}</p>
        </div>

      </header>
    </div>
  );
}

export default App;
