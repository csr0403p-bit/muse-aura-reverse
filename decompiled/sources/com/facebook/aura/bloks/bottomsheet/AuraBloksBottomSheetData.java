package com.facebook.aura.bloks.bottomsheet;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetData extends C06G {
    public static final int $stable = 8;
    public final boolean addToBackStack;
    public final AuraBloksBottomSheetContentInterface content;
    public final AuraBloksBottomSheetHeaderData header;
    public final Function0<Unit> onDismiss;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBloksBottomSheetData) {
                AuraBloksBottomSheetData auraBloksBottomSheetData = (AuraBloksBottomSheetData) obj;
                if (!C7384Etj.areEqual(this.header, auraBloksBottomSheetData.header) || !C7384Etj.areEqual(this.content, auraBloksBottomSheetData.content) || this.addToBackStack != auraBloksBottomSheetData.addToBackStack || !C7384Etj.areEqual(this.onDismiss, auraBloksBottomSheetData.onDismiss)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraBloksBottomSheetData copy$default(AuraBloksBottomSheetData auraBloksBottomSheetData, AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            auraBloksBottomSheetHeaderData = auraBloksBottomSheetData.header;
        }
        if ((i & 2) != 0) {
            auraBloksBottomSheetContentInterface = auraBloksBottomSheetData.content;
        }
        if ((i & 4) != 0) {
            z = auraBloksBottomSheetData.addToBackStack;
        }
        if ((i & 8) != 0) {
            function0 = auraBloksBottomSheetData.onDismiss;
        }
        AnonymousClass003.A0u(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface);
        return new AuraBloksBottomSheetData(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface, z, function0);
    }

    public final AuraBloksBottomSheetHeaderData component1() {
        return this.header;
    }

    public final AuraBloksBottomSheetContentInterface component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.addToBackStack;
    }

    public final Function0<Unit> component4() {
        return this.onDismiss;
    }

    public final boolean getAddToBackStack() {
        return this.addToBackStack;
    }

    public final AuraBloksBottomSheetContentInterface getContent() {
        return this.content;
    }

    public final AuraBloksBottomSheetHeaderData getHeader() {
        return this.header;
    }

    public final Function0<Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.content, AnonymousClass005.A0E(this.header)), this.addToBackStack) + AnonymousClass006.A0D(this.onDismiss);
    }

    public AuraBloksBottomSheetData(AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface, boolean z, Function0<Unit> function0) {
        AnonymousClass003.A0u(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface);
        this.header = auraBloksBottomSheetHeaderData;
        this.content = auraBloksBottomSheetContentInterface;
        this.addToBackStack = z;
        this.onDismiss = function0;
    }

    public final AuraBloksBottomSheetData copy(AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface, boolean z, Function0<Unit> function0) {
        AnonymousClass003.A0u(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface);
        return new AuraBloksBottomSheetData(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface, z, function0);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraBloksBottomSheetData(AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface, boolean z, Function0 function0, int i, C06H c06h) {
        this(auraBloksBottomSheetHeaderData, auraBloksBottomSheetContentInterface, z, (i & 8) != 0 ? null : function0);
    }
}
