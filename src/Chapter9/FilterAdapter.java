package Chapter9;

import Chapter9.Wave.Filter;
import Chapter9.Wave.Waveform;

public class FilterAdapter implements Processor1{
	Filter filter;
	public FilterAdapter(Filter filter){
		this.filter = filter;
	}
	@Override
	public String name() {
		return filter.name();
	}
	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
	
}
