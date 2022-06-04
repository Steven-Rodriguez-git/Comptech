
import * as React from 'react';
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
const footers = [
    {title: 'UNIVERSIDAD NACIONAL DE COLOMBIA',
    description:['Bogota. Colombia',"Estructuras de Datos"]}
    ,{
      title: 'MENU PRINCIPAL',
      description: ['Home', 'All Components', 'Help'],
    },
    {
      title: 'DISCOVER THE TEAM',
      description: [
        'Nombres',
        'De cada uno',
        'Correo depronto',
        'Apellido',
        'falta uno',
      ],
    },
    {
      title: 'FIND US ON',
      description: ['Facebook', 'Twitter', 'Instagram'],
    }
    
  ];
export default function(){
    return (
        <React.Fragment>
          <GlobalStyles styles={{ ul: { margin: 0, padding: 0, listStyle: 'none' } }} />
    
          {/* Footer */}
          <Container
            maxWidth="md"
            component="footer"
            sx={{
              borderTop: (theme) => `1px solid ${theme.palette.divider}`,
              mt: 8,
              py: [3, 6],
            }}
          >
            <Grid container spacing={4} justifyContent="space-evenly">
              
              {footers.map((footer) => (
                <Grid item xs={6} sm={3} key={footer.title}>
                  <Typography variant="h6" color="text.primary" gutterBottom>
                    {footer.title}
                  </Typography>
                  <ul>
                    {footer.description.map((item) => (
                      <li key={item}>
                        <Link href="#" variant="subtitle1" color="text.secondary">
                          {item}
                        </Link>
                      </li>
                    ))}
                  </ul>
                </Grid>
              ))}
            </Grid>
          </Container>
          {/* End footer */}
        </React.Fragment>
      );

}