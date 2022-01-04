package guru.springframework.sfgrestbrewery.repositories;


import guru.springframework.sfgrestbrewery.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {

    Mono<Beer> findByUpc(String upc);

//    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);
//    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);
//    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    // These DO NOT WORK, but MAY in future
//    Flux<Page<Beer>> findAllByBeerName(String beerName, Pageable pageable);
//    Flux<Page<Beer>> findAllByBeerStyle(String beerStyle, Pageable pageable);
//    Flux<Page<Beer>> findAllByBeerNameAndBeerStyle(String beerName, String beerStyle, Pageable pageable);
//    Flux<Page<Beer>> findAllByBeer(Pageable pageable);
}
