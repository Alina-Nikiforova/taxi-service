package taxi.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.dao.CarDao;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Car;
import taxi.model.Driver;

@Service
public class CarServiceImpl implements CarService {
    private static final Logger logger = LogManager.getLogger(CarServiceImpl.class);
    @Inject
    private CarDao carDao;

    @Override
    public void addDriverToCar(Driver driver, Car car) {
        logger.info("Method add driver to car was called. "
                + "Params: driver = {}, car = {}", driver, car);
        car.getDrivers().add(driver);
        carDao.update(car);
    }

    @Override
    public void removeDriverFromCar(Driver driver, Car car) {
        logger.info("Method remove driver from car was called. "
                + "Params: driver = {}, car = {}", driver, car);
        car.getDrivers().remove(driver);
        carDao.update(car);
    }

    @Override
    public List<Car> getAllByDriver(Long driverId) {
        logger.info("Method get all by driver was called. "
                + "Params: driverId = {}", driverId);
        return carDao.getAllByDriver(driverId);
    }

    @Override
    public Car create(Car car) {
        logger.info("Method create was called. "
                + "Params: car = {}", car);
        return carDao.create(car);
    }

    @Override
    public Car get(Long id) {
        logger.info("Method get was called. "
                + "Params: id = {}", id);
        return carDao.get(id).get();
    }

    @Override
    public List<Car> getAll() {
        logger.info("Method get all was called.");
        return carDao.getAll();
    }

    @Override
    public Car update(Car car) {
        logger.info("Method update was called. "
                + "Params: car = {}", car);
        return carDao.update(car);
    }

    @Override
    public boolean delete(Long id) {
        logger.info("Method delete was called. "
                + "Params: id = {}", id);
        return carDao.delete(id);
    }
}
