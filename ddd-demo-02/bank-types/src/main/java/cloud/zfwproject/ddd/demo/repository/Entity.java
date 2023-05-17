package cloud.zfwproject.ddd.demo.repository;

/**
 * @author dz0401048
 * @version 1.0
 * @description 实体类 Maker 接口
 * @date 2023/5/17 10:07 AM
 */
public interface Entity<ID extends Identifier> extends Identifiable<ID> {
}
