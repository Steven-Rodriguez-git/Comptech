import * as React from 'react';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Button from 'react-bootstrap/esm/Button';
import Typography from '@mui/material/Typography';

export default function BigCard() {
  return (
    <Card sx={{ width: 600,height:600 }}>
      <CardMedia
        component="img"
        alt="Intel i9"
        image="https://m.media-amazon.com/images/I/81A3penuVOL._AC_SX679_.jpg"
      />
      <CardContent>
        <Typography gutterBottom variant="h5" component="div">
        Intel Core i9-12900K
        </Typography>
        <Typography variant="body2" color="text.secondary">
        Intel Core i9-12900K Procesador de escritorio 16 (8P+8E) núcleos de hasta 5,2 GHz desbloqueado LGA1700 serie 600 chipset 125W
        </Typography>
      </CardContent>
      <CardActions>
    <center>
      <Button  target="_blank" href="https://www.amazon.com/-/es/i9-12900K-Procesador-escritorio-n%C3%BAcleos-desbloqueado/dp/B09FXDLX95/ref=sr_1_7?__mk_es_US=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3JIHABF7UE5ST&keywords=intel+core+i9+processor&qid=1654919777&sprefix=procesador+intel+core+i9%2Caps%2C143&sr=8-7" variant="primary">Comprar</Button>
      </center>
      </CardActions>
    </Card>
  );
}