/**
 * 
 */
package in.cubestack.apps.android.storm.entitites;

import in.cubestack.android.lib.storm.FieldType;
import in.cubestack.android.lib.storm.annotation.Column;
import in.cubestack.android.lib.storm.annotation.PrimaryKey;
import in.cubestack.android.lib.storm.annotation.Table;

/**
 * @author sdub14
 *
 */
@Table(name = "SETTAB")
public class TestSetBasedEntity {

	@PrimaryKey
	@Column(name="ID", type = FieldType.LONG, addedVersion = 1)
	private long id;

	@Column(name="PAR_ID", type=FieldType.LONG)
	private long parentId;
	
	@Column(name="RNK", type=FieldType.INTEGER)
	private int rank;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
