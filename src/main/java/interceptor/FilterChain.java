package interceptor;

import java.util.List;
import java.util.ArrayList;

public class FilterChain 
{
	private List<Filter> _filters;
	private MyInterface _target;
	
	public FilterChain()
	{
		this._filters = new ArrayList<Filter>();
	}
	
	public void addFilter( Filter f ) 
	{
		this._filters.add( f );
	}
	
	public void execute( double petition )
	{
		for ( Filter f : this._filters )
		{
			System.out.println("New speed: " + f.execute(petition) + "m/s");
		}
		this._target.execute( petition );
	}
	
	public void setTarget( MyInterface t )
	{
		this._target = t;
	}	
}
