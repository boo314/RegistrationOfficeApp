package registerOffice.management;

import java.util.List;

public interface ManagerInterface<TEntity> {

	public TEntity get(Condition<TEntity> condition);

	public List<TEntity> getAll(/**/);

	public boolean save(Condition<TEntity> condition);

	public boolean delete(Condition<TEntity> condition);

	/**
	 * inne metody
	 */

}
