import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import "./style.css";
function Navbar() {
    return (
        <header>
        <nav className="container">
          <div className="dsmovie-nav-container">
            <h1>DSMovie</h1>
            <a href="https://github.com/Marciamuli">
                <div className="dsmovie-contact-contaner">
                  <GithubIcon/>
                  <p className='dsmovie-contact-link'>/devsuperior</p>
                </div>
            </a>
          </div>
        </nav>
    </header>
    );
}

export default Navbar;