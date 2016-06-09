package com.ep.net.packet.bean;

import com.ep.stream.MarshalException;
import com.ep.stream.OctetsStream;

//This File Is Generated By DB Generator, Do Not Modify.
/**
 *  公共部分-返回消息
 */
public class MBResponseBase implements com.ep.stream.Marshal
{
	// 响应状态
	public int state;
	// 响应消息
	public String msg;
	// 响应消息
	public long token;

	public MBResponseBase()
	{
		this.state = 0;
		this.msg = "";
		this.token = 0l;
	}

	public MBResponseBase(int _state_, String _msg_, long _token_)
	{
		this.state = _state_;
		this.msg = _msg_;
		this.token = _token_;
	}


	@Override
	public OctetsStream marshal(OctetsStream _os_)
	{
		_os_.marshal(state);
		_os_.marshal(msg,"UTF-8");
		_os_.marshal(token);
		return _os_;
	}

	@Override
	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException
	{
		state = _os_.unmarshal_int();
		msg = _os_.unmarshal_String("UTF-8");
		token = _os_.unmarshal_long();
		return _os_;
	}

	@Override
	public final boolean equals(Object _o_)
	{
		if(this == _o_)
			return true;
		if(!(_o_ instanceof com.ep.net.packet.bean.MBResponseBase))
			return false;
		com.ep.net.packet.bean.MBResponseBase _o_t = (com.ep.net.packet.bean.MBResponseBase)_o_;
		if(state != _o_t.state)
			return false;
		if(!msg.equals(_o_t.msg))
			return false;
		if(token != _o_t.token)
			return false;
		return true;
	}

	@Override
	public final int hashCode()
	{
		int _h_ = 0;
		_h_ = 31 * _h_ + state;
		_h_ = 31 * _h_ + msg.hashCode();
		_h_ = 31 * _h_ + (int)(token ^ (token >>> 32));
		return _h_;
	}

	@Override
	public final String toString()
	{
		return toString(0);
	}

	public final String toString(int depth) {
		depth++;
		StringBuilder buffer = new StringBuilder();
		buffer.append('\n');
		for (int i = 0; i < depth - 1; i++){
			buffer.append('\t');
		}
		buffer.append('{');
		buffer.append('\n');

		for (int i = 0; i < depth; i++){
			buffer.append('\t');
		}
		buffer.append("state").append(": ");
		buffer.append(state);
		buffer.append(';');
		buffer.append("\n");


		for (int i = 0; i < depth; i++){
			buffer.append('\t');
		}
		buffer.append("msg").append(": ");
		buffer.append(msg);
		buffer.append(';');
		buffer.append("\n");


		for (int i = 0; i < depth; i++){
			buffer.append('\t');
		}
		buffer.append("token").append(": ");
		buffer.append(token);
		buffer.append(';');
		buffer.append("\n");


		for ( int i = 0 ; i < depth-1 ; i++ ) {
			buffer.append('\t');
		}
		buffer.append('}');
		buffer.append(';');
		return buffer.toString();
	}
}
