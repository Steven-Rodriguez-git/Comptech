import CardsComponents from "../../components/CardsComponents.js";
import Filtros from "../../components/filtros.jsx";

import ThemeProvider from '@mui/material/styles/ThemeProvider';
import createTheme from '@mui/material/styles/createTheme';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import CardHeader from '@mui/material/CardHeader';
import CssBaseline from '@mui/material/CssBaseline';
import Grid from '@mui/material/Grid';
import StarIcon from '@mui/icons-material/StarBorder';
import Toolbar from '@mui/material/Toolbar';
import Link from '@mui/material/Link';
import GlobalStyles from '@mui/material/GlobalStyles';
import Container from '@mui/material/Container';



export default function AllComponents (){
return(
    // <ThemeProvider theme={theme}>


  <Grid container spacing={2} fluid style={{ padding: "40px", backgroundColor: "#A23E9B"}}>
  <Grid item xs={4} fluid style={{ padding: "80px", backgroundColor: "#3EA270"}}>
    <Filtros></Filtros>
  </Grid>
  <Grid item xs={7}>
    <CardsComponents/>
  </Grid>


  {/* <Grid item xs={3}>
     <Item>xs=4</Item> 
  </Grid>
  <Grid item xs={9}>
  </Grid> */}
</Grid>
//</ThemeProvider>

);
};