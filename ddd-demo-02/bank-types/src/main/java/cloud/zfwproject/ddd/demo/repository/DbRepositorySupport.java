package cloud.zfwproject.ddd.demo.repository;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Getter;

/**
 * @author dz0401048
 * @version 1.0
 * @description TODO
 * @date 2023/5/17 10:36 AM
 */
public abstract class DbRepositorySupport<T extends Aggregate<ID>, ID extends Identifier> implements Repository<T, ID> {

    @Getter
    private final Class<T> targetClass;

    protected DbRepositorySupport(Class<T> targetClass) {
        this.targetClass = targetClass;
    }

    protected abstract void onInsert(T aggregate);
    protected abstract T onSelect(ID id);
    protected abstract void onUpdate(T aggregate);
    protected abstract void onDelete(T aggregate);


}
