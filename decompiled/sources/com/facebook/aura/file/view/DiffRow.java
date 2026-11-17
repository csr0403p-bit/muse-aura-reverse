package com.facebook.aura.file.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class DiffRow extends C06G {
    public static final int $stable = 0;
    public final DiffRowKind kind;
    public final Integer newLineNumber;
    public final Integer oldLineNumber;
    public final String text;
    public final Integer unmodifiedLineCount;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiffRow) {
                DiffRow diffRow = (DiffRow) obj;
                if (this.kind != diffRow.kind || !C7384Etj.areEqual(this.text, diffRow.text) || !C7384Etj.areEqual(this.oldLineNumber, diffRow.oldLineNumber) || !C7384Etj.areEqual(this.newLineNumber, diffRow.newLineNumber) || !C7384Etj.areEqual(this.unmodifiedLineCount, diffRow.unmodifiedLineCount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DiffRow copy$default(DiffRow diffRow, DiffRowKind diffRowKind, String str, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            diffRowKind = diffRow.kind;
        }
        if ((i & 2) != 0) {
            str = diffRow.text;
        }
        if ((i & 4) != 0) {
            num = diffRow.oldLineNumber;
        }
        if ((i & 8) != 0) {
            num2 = diffRow.newLineNumber;
        }
        if ((i & 16) != 0) {
            num3 = diffRow.unmodifiedLineCount;
        }
        return diffRow.copy(diffRowKind, str, num, num2, num3);
    }

    public final DiffRowKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final Integer component3() {
        return this.oldLineNumber;
    }

    public final Integer component4() {
        return this.newLineNumber;
    }

    public final Integer component5() {
        return this.unmodifiedLineCount;
    }

    public final DiffRowKind getKind() {
        return this.kind;
    }

    public final Integer getNewLineNumber() {
        return this.newLineNumber;
    }

    public final Integer getOldLineNumber() {
        return this.oldLineNumber;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getUnmodifiedLineCount() {
        return this.unmodifiedLineCount;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0D(this.oldLineNumber)) * 31) + AnonymousClass006.A0D(this.newLineNumber)) * 31) + C06G.A04(this.unmodifiedLineCount);
    }

    public DiffRow(DiffRowKind diffRowKind, String str, Integer num, Integer num2, Integer num3) {
        AnonymousClass003.A0u(diffRowKind, str);
        this.kind = diffRowKind;
        this.text = str;
        this.oldLineNumber = num;
        this.newLineNumber = num2;
        this.unmodifiedLineCount = num3;
    }

    public final DiffRow copy(DiffRowKind diffRowKind, String str, Integer num, Integer num2, Integer num3) {
        AnonymousClass003.A0u(diffRowKind, str);
        return new DiffRow(diffRowKind, str, num, num2, num3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DiffRow(DiffRowKind diffRowKind, String str, Integer num, Integer num2, Integer num3, int i, C06H c06h) {
        this(diffRowKind, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3);
    }
}
