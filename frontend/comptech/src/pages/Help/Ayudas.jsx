
import * as React from 'react';
import Grid from '@mui/material/Grid';
import Typography from '@mui/material/Typography';


export default function Ayudas (){ 
    return (
    <Grid
      container
      justify="center"
      alignItems="center"
      direction="column"
    >
      <Grid item>
        <Typography variant="h5">
        1. Escribe el primer periferico que deseas comparar y clickea cuando aparezca el nombre desplegado. haz lo mismo la cantidad de veces queridas
        </Typography>
      </Grid>
      <Grid >
      <Typography  color="text.secondary">      
      A continuacion te daremos una leve explicacion 
        para que uses a tu comodidad este sitio
        </Typography>
      </Grid>
    </Grid>
  );
}
