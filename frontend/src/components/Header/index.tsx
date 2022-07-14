import icon from '../../assets/img/cabecalho.svg'
import './styles.css'

function Header(){
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={icon} alt="DsMeta"/>
                <h1>DsMeta</h1>
                <p>
                    Desenvolvido por Janders Melhor IGL do BR
                </p>    
            </div>
        </header>

        
    )
}

export default Header