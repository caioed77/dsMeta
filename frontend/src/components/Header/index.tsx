import icon from '../../assets/img/cabecalho.svg'
import './styles.css'

const name = "Caio Eduardo"

function Header(){
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={icon} alt="DsMeta"/>
                <h1>DsMeta</h1>
                <p>
                    Desenvolvido por {name}
                </p>    
            </div>
        </header>

        
    )
}

export default Header