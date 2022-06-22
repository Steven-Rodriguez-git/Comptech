import React from "react";
import Desplegado from "./Desplegado.jsx";

import Container from "react-bootstrap/esm/Container";
import Grid from '@mui/material/Grid';
import Typography from '@mui/material/Typography';
import "../styles/style.css"


export default function filtros() {
  return (
    <React.Fragment>
        
      
      <Container fluid style={{ padding: "80px", backgroundColor: "#e0e0e0"}}>
      <Grid item>
        <Typography variant="h5">
        FILTROS
        </Typography>
      
      <Grid>
      <Typography  color="text.secondary">      
     Almacenamiento
        </Typography>
      </Grid>
      <Desplegado></Desplegado>

      <Grid>
      <Typography  color="text.secondary">      
     Board
        </Typography>
      </Grid>
      <Desplegado></Desplegado>
     
     
      <Grid>
      <Typography  color="text.secondary">      
     Grafico
        </Typography>
      </Grid>
      <Desplegado></Desplegado>
      {/* <Desplegado handler=handler() ></Desplegado> envio y creo una funcion que almacene en una variable todos los estados actuales*/}
          
      <Grid>
      <Typography  color="text.secondary">      
     Procesador
        </Typography>
      </Grid>
      <Desplegado></Desplegado>


      <Grid>
      <Typography  color="text.secondary">      
     Ram
        </Typography>
      </Grid>
      <Desplegado></Desplegado>

    </Grid>
      </Container>
    </React.Fragment>
  );
};
