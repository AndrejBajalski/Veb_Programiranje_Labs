package mk.ukim.finki.wp.lab.repository.JPA;
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepositoryJPA extends JpaRepository<Artist, Long> {

}
