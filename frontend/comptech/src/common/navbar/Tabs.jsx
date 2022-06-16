import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import HomeIcon from '@mui/icons-material/Home';
import HardwareIcon from '@mui/icons-material/Hardware';
import HelpIcon from '@mui/icons-material/Help';
import { Link } from "react-router-dom";
//import * as Logos from '@mui/icons-material'

export default function IconLabelTabs() {
  const [value, setValue] = React.useState(0);//que boton lo llama, el cambio para ese boton
  

  const handleChange = (event, newValue) => {        
    setValue(newValue);
  };
    
  return (
    <Tabs value={value} onChange={handleChange} aria-label="icon label tabs example">
      <Link to="/">
        <Tab href="/" sx={{color: "white", opacity:"48%","&:focus": { color: "#12005e" ,opacity:"55%"},"&:hover": { color: "#12005e" ,opacity:"55%"} }} icon={<HomeIcon/>} label="HOME" />
      </Link>
      <Link to='/'>
      <Tab sx={{color: "white", opacity:"48%","&:focus": { color: "#12005e" ,opacity:"55%"},"&:hover": { color: "#12005e" ,opacity:"55%"} }} icon={<HardwareIcon />} label="ALL COMPONENTS"/>
      </Link>
      <Link to="/help">
        <Tab sx={{color: "white", opacity:"48%","&:focus": { color: "#12005e" ,opacity:"55%"}, "&:hover": { color: "#12005e" ,opacity:"55%"} }} icon={<HelpIcon />} label="HELP"/>
      </Link> 
    </Tabs>
  );
}
