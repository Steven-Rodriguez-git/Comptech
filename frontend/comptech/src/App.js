import NavBar from './common/navbar/NavBar';
import './App.css';
import AllComponents from "./pages/AllComponents/AllCompents"
import Principal from './pages/Home/Principal'; 
import Help from './pages/Help/Help';
import Footer from './common/Footer';
import { BrowserRouter  as Router, Routes, Route } from 'react-router-dom'

function App() {
 //let aa = fetch("http://localhost:4000/");

  return (
    <Router basename={process.env.PUBLIC_URL}>
      <NavBar />  
       <Routes>
      {/* <Route path="/" element={<Home />} />      */}
      <Route path="/" element={<Principal/>}></Route>
      <Route path="/help" element={<Help/>}></Route>
      <Route path="/allComponents" element={<AllComponents/>}></Route>
      
       </Routes>
   <div/>
    <Footer></Footer>
    </Router>
       
  );
}

export default App;
