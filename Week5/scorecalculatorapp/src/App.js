import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Deep Narayan"}
        Collage={"Lovely Professional University"}
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
