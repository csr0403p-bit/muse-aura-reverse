package X;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes5.dex */
public abstract class E8P {
    public static final Splitter A00;
    public static final Splitter A01;
    public static final ImmutableMap A02;

    static {
        Splitter splitterOn = Splitter.on(',');
        CharMatcher charMatcher = CharMatcher.Whitespace.INSTANCE;
        A00 = new Splitter(splitterOn.strategy, false, charMatcher, Integer.MAX_VALUE);
        A01 = new Splitter(Splitter.on('=').strategy, false, charMatcher, Integer.MAX_VALUE);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("initialCapacity", new E9N());
        builder.put("maximumSize", new E9K());
        builder.put("maximumWeight", new E9J());
        builder.put("concurrencyLevel", new E9O());
        E8V[] e8vArr = E8V.A00;
        builder.put("weakKeys", new E9M());
        builder.put("softValues", new E9H());
        builder.put("weakValues", new E9H());
        builder.put("recordStats", new E9I());
        builder.put("expireAfterAccess", new E9G());
        builder.put("expireAfterWrite", new E9E());
        builder.put("refreshAfterWrite", new E9F());
        builder.put("refreshInterval", new E9F());
        A02 = builder.buildOrThrow();
    }
}
