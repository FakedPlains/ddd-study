package cloud.zfwproject.ddd.demo.repository;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 10:09 AM
 */
public interface Repository<T extends Aggregate<ID>, ID extends Identifier> {

    /**
     * 将一个 Aggregate 附属到一个 Repository，使其可追踪
     *
     * @param aggregate
     */
    void attach(T aggregate);

    /**
     * 解除一个 Aggregate 的追踪
     *
     * @param aggregate
     */
    void detach(T aggregate);


    T find(ID id);

    void remove(T aggregate);

    T save(T aggregate);

}
