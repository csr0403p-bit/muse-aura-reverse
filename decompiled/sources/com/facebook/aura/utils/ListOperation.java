package com.facebook.aura.utils;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ListOperation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ListOperation[] $VALUES;
    public static final ListOperation ADD;
    public static final ListOperation REMOVE;
    public static final ListOperation UPDATE;

    static {
        ListOperation listOperation = new ListOperation("ADD", 0);
        ADD = listOperation;
        ListOperation listOperation2 = new ListOperation("REMOVE", 1);
        REMOVE = listOperation2;
        ListOperation listOperation3 = new ListOperation("UPDATE", 2);
        UPDATE = listOperation3;
        ListOperation[] listOperationArr = {listOperation, listOperation2, listOperation3};
        $VALUES = listOperationArr;
        $ENTRIES = C3cG.A0w(listOperationArr);
    }

    public static Ey9<ListOperation> getEntries() {
        return $ENTRIES;
    }

    public static ListOperation valueOf(String str) {
        return (ListOperation) Enum.valueOf(ListOperation.class, str);
    }

    public static ListOperation[] values() {
        return (ListOperation[]) $VALUES.clone();
    }

    public ListOperation(String str, int i) {
    }
}
