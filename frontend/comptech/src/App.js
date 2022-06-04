import NavBar from './common/navbar/NavBar';
import Cabezera from './common/navbar/Cabezera';
import './App.css';
import Home from './pages/Home/Home';
import Principal from './pages/Home/Principal';
import Footer from './common/Footer';
import { BrowserRouter  as Router, Routes, Route } from 'react-router-dom'

function App() {
  return (
    <Router basename={process.env.PUBLIC_URL}>
      <Cabezera></Cabezera>
      {/* <NavBar />  */}
       <Routes>
      {/* <Route path="/" element={<Home />} />      */}
      <Route path="/" element={<Principal></Principal>}></Route>
       </Routes>
   <div/>
    <Footer></Footer>
    </Router>
       
  );
}

export default App;
