
import { createUserWithEmailAndPassword, getAuth} from "firebase/auth";
import {useState} from "react";
import './App.css';

function App() {
    const [email, setEmail] = useState()
    const [password, setPassword] = useState()
    const auth= getAuth();
    const handleForm = async () => {
        console.log("first")
        await createUserWithEmailAndPassword(auth, email, password).then(userCredential => {
            const user = userCredential.user;
            console.log(user)
        }).catch(error => {
            console.log(error)
        })
        console.log("second")
    }
    return (
        <div className="App">
            <form>
                <input required type='email' value={email} onChange={(event) => {
                    setEmail(event.target.value)

                }}/>
                <input type='password' value={password} onChange={(event) => {
                    setPassword(event.target.value)
                }}/>
                <button onClick={() => handleForm()}>envoyer</button>
            </form>
        </div>
    );
}

export default App;
