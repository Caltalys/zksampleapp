package vn.toancauxanh.gg.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import vn.toancauxanh.model.Model;

@MappedSuperclass
public class Asset<T extends Asset<T>> extends Model<T> {
	
	@Transient
	public boolean isNew() {
		return getTrangThaiSoan() == null || getTrangThaiSoan().isEmpty();
	}
}
