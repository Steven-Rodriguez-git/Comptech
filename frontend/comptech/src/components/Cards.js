import Card from 'react-bootstrap/Card'
import Button from 'react-bootstrap/esm/Button';

const Cards = () => {
  return (
    <div>
      <Card style={{ width: "18rem" }}>
        <Card.Img variant="top" src="https://media.ldlc.com/r1600/ld/products/00/05/94/32/LD0005943216.jpg" />
        <Card.Body>
          <Card.Title>Nvidia RTX 3090 Ti</Card.Title>
          <Card.Text>
            Some quick example text to build on the card title and make up the
            bulk of the card's content.
          </Card.Text>
          <Button  target="_blank" href="https://www.amazon.com/-/es/GeForce-24G-P5-4985-KR-trasera-electr%C3%B3nica-gratuita/dp/B09W4SN2M7/ref=sr_1_2?keywords=3090ti&qid=1654918206&sprefix=3090t%2Cspecialty-aps%2C106&sr=8-2" variant="primary">Comprar</Button>
        </Card.Body>
      </Card>
    </div>
  );
};

export default Cards;
