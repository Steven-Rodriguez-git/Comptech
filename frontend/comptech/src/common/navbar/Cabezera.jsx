import Tabs from './Tabs';
import Busqueda from './Busqueda';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';

function Logo(){
  return(
    
    <Button variant="contained">COMPTECH</Button>//estoy muy dormido para dejarlo bonito
  );

}

export default function Cabezera() {
  // const [value, setValue] = React.useState('one');

  // const handleChange = (event, newValue) => {
  //   setValue(newValue);
  // };
  
  
  return (
  <Box
    sx={{
      width: '100%',
      height: '7%',
      display: 'flex',
      backgroundColor: '#455a64',
      alignItems:"center"
    }}>
      <Logo></Logo>
    <Box>
      <Busqueda></Busqueda>
    </Box>
    <Box sx={{
      width: '100%',
      height: '100%',
      display: 'flex',
      justifyContent:"flex-end",
    }}>
      <Tabs ></Tabs>
    </Box>
  </Box>  
  );
}