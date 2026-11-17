package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class Maps$EntryFunction implements Function<Map.Entry<?, ?>, Object> {
    public static final /* synthetic */ Maps$EntryFunction[] A00;
    public static final Maps$EntryFunction A01;

    static {
        Maps$EntryFunction maps$EntryFunction = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.1
            @Override // com.google.common.base.Function
            public final /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        A01 = maps$EntryFunction;
        A00 = new Maps$EntryFunction[]{maps$EntryFunction, new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.2
            @Override // com.google.common.base.Function
            public final /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }};
    }

    public static Maps$EntryFunction valueOf(String name) {
        return (Maps$EntryFunction) Enum.valueOf(Maps$EntryFunction.class, name);
    }

    public static Maps$EntryFunction[] values() {
        return (Maps$EntryFunction[]) A00.clone();
    }

    public Maps$EntryFunction(String $enum$name, int $enum$ordinal) {
    }
}
