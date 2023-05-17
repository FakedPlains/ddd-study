package cloud.zfwproject.ddd.demo.repository;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 10:07 AM
 */
public interface Identifiable<ID extends Identifier> {

    ID getId();

}
