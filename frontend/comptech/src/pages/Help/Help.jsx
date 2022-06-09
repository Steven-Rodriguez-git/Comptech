import Computadoras from "../../components/Computadoras";
import Titulos from "./Titulos";
import Ayudas from "./Ayudas";
import ImagenAyuda from "./ImagenAyuda";


import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardHeader from '@mui/material/CardHeader';
import CssBaseline from '@mui/material/CssBaseline';
import Grid from '@mui/material/Grid';
import StarIcon from '@mui/icons-material/StarBorder';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Link from '@mui/material/Link';
import GlobalStyles from '@mui/material/GlobalStyles';
import Container from '@mui/material/Container';


export default function Help (){
return(
    <div>
<Titulos></Titulos>

<Grid container spacing={2}>
  <Grid item xs={6}>
  <ImagenAyuda></ImagenAyuda>
  </Grid>
  <Grid item xs={6}>
  <Ayudas ></Ayudas>
  </Grid>
  <Grid item xs={6}>
    {/* <Item>xs=4</Item> */}
  </Grid>
  <Grid item xs={6}>
    {/*    */}
  </Grid>
</Grid>
{/* 
    <Box
        sx={{
        width: '100%',
        height: '30%',
        display: 'flex',
        backgroundColor: '#455a64',
        alignItems:"center"
        }}>
        <Box>

        <Box
        sx={{
          width:'100%'
        
        }}>
      <ImagenAyuda></ImagenAyuda>
        </Box>
        </Box>
        <Box sx={{
        width: '100%',
        height: '100%',
        display: 'flex',
        justifyContent:"flex-end",
        }}>
      <Ayudas ></Ayudas>
    </Box>
  </Box>   */}

    
    
<Computadoras/>
    </div>
);
};
