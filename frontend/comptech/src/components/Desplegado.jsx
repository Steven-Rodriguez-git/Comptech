import * as React from 'react';
import OutlinedInput from '@mui/material/OutlinedInput';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';

async function pedirDatos(atributo){
    
    console.log(atributo);

    let url = 'http://localhost:8080/';
    url = url + atributo[0];
    fetch(url);//.thenx((response) => response.json()).then((dog) => console.log(dog));
    console.log(url);
  }

const names = [
  'ALM_tipo',
  'ALM_capacidad',
  'ALM_velLectura',
  'ALM_velEscritura',
  'ALM_marca',
  'ALM_precio',
  'ALM_nombre',
];


export default function MultipleSelect() {
  const [personName, setPersonName] = React.useState([]);
  const[select, setSelect]=React.useState([]);

  const handleChange = (event) => {
    const {
      target: { value },
    } = event;
    setPersonName(
      typeof value === 'string' ? value.split(',') : value,
    );
    const arbolesTraidos = pedirDatos(personName);
    
};

  return (
    <div>
      <FormControl sx={{ m: 1, width: 200 }}>
        <InputLabel id="demo-multiple-name-label">Name</InputLabel>
        <Select
          labelId="demo-multiple-name-label"
          id="demo-multiple-name"
          multiple
          value={personName}
          onChange={handleChange}
          input={<OutlinedInput label="Name" />}
        >
          {names.map((name) => (
            <MenuItem
              key={name}
              value={name}
            >
              {name}
            </MenuItem>
          ))}
        </Select>
      </FormControl>
    </div>
  );
}