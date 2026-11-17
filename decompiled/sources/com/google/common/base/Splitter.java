package com.google.common.base;

import com.google.common.base.CharMatcher;

/* loaded from: classes5.dex */
public final class Splitter {
    public final int limit = Integer.MAX_VALUE;
    public final AnonymousClass1 strategy;
    public final CharMatcher trimmer;

    /* renamed from: com.google.common.base.Splitter$1, reason: invalid class name */
    public class AnonymousClass1 {
        public final /* synthetic */ CharMatcher val$separatorMatcher;

        /* renamed from: com.google.common.base.Splitter$1$1, reason: invalid class name and collision with other inner class name */
        public class C04511 extends SplittingIterator {
            public C04511(Splitter splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }
        }

        public AnonymousClass1(final CharMatcher val$separatorMatcher) {
            this.val$separatorMatcher = val$separatorMatcher;
        }
    }

    public abstract class SplittingIterator extends AbstractIterator<String> {
        public int limit;
        public int offset = 0;
        public final CharSequence toSplit;
        public final CharMatcher trimmer;

        public SplittingIterator(Splitter splitter, CharSequence toSplit) {
            this.trimmer = splitter.trimmer;
            this.limit = splitter.limit;
            this.toSplit = toSplit;
        }
    }

    public static Splitter on(char separator) {
        return new Splitter(new AnonymousClass1(new CharMatcher.Is(separator)), false, CharMatcher.None.INSTANCE, Integer.MAX_VALUE);
    }

    public Splitter(AnonymousClass1 strategy, boolean omitEmptyStrings, CharMatcher trimmer, int limit) {
        this.strategy = strategy;
        this.trimmer = trimmer;
    }
}
