package org.seckill.entity;

import java.util.Date;

/**
 * 秒杀订单 Successkill ----- 用户
 * Note: SuccesskilledDao.xml 里复合对象的赋值，通过seckillItem.属性的方式标识
 */
public class Successkilled
{
	private long seckillId; // 秒杀商品号
	private long userPhone; // 用户手机号
	private short state; // 秒杀状态：付款1 未付款0
	private Date createTime; // 秒杀订单创建时间
	private Seckill seckillItem; // 秒杀订单里直接出现秒杀商品明细，方便前台展示

	public Seckill getSeckillItem() {
		return seckillItem;
	}

	public void setSeckillItem(Seckill seckillItem) {
		this.seckillItem = seckillItem;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Successkilled{" +
				"seckillId=" + seckillId +
				", userPhone=" + userPhone +
				", state=" + state +
				", createTime=" + createTime +
				", seckill=" + seckillItem +
				'}';
	}
}
