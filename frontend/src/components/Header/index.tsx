import icon from '../../assets/img/cabecalho.svg'
import './styles.css'

function Header(){
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={icon} alt="DsMeta"/>
                <h1>DsMeta</h1>
                <p>
                    Desenvolvido por IGL
                </p>
            </div>
        </header>
    )
}

export default Header