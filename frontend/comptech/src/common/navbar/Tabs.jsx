import * as React from 'react';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import HomeIcon from '@mui/icons-material/Home';
import HardwareIcon from '@mui/icons-material/Hardware';
import HelpIcon from '@mui/icons-material/Help';
//import * as Logos from '@mui/icons-material'

export default function IconLabelTabs() {
  const [value, setValue] = React.useState(0);

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
    <Tabs value={value} onChange={handleChange} aria-label="icon label tabs example">
      <Tab icon={<HomeIcon />} label="HOME" />
      <Tab icon={<HardwareIcon />} label="ALL COMPONENTS" />
      <Tab icon={<HelpIcon />} label="TIEMPOS" />
    </Tabs>
  );
}
