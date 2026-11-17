package com.facebook.aura.vds.compose.button;

import X.AVy;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraMultiIconButtonPillEntry extends C06G {
    public static final int $stable = 0;
    public final String contentDescription;
    public final boolean enabled;
    public final AVy iconPainter;
    public final B6A iconTint;
    public final Function0<Unit> onClick;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMultiIconButtonPillEntry) {
                AuraMultiIconButtonPillEntry auraMultiIconButtonPillEntry = (AuraMultiIconButtonPillEntry) obj;
                if (!C7384Etj.areEqual(this.iconPainter, auraMultiIconButtonPillEntry.iconPainter) || !C7384Etj.areEqual(this.contentDescription, auraMultiIconButtonPillEntry.contentDescription) || !C7384Etj.areEqual(this.onClick, auraMultiIconButtonPillEntry.onClick) || !C7384Etj.areEqual(this.iconTint, auraMultiIconButtonPillEntry.iconTint) || this.enabled != auraMultiIconButtonPillEntry.enabled) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-8wvRk98$default, reason: not valid java name */
    public static /* synthetic */ AuraMultiIconButtonPillEntry m2433copy8wvRk98$default(AuraMultiIconButtonPillEntry auraMultiIconButtonPillEntry, AVy aVy, String str, Function0 function0, B6A b6a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVy = auraMultiIconButtonPillEntry.iconPainter;
        }
        if ((i & 2) != 0) {
            str = auraMultiIconButtonPillEntry.contentDescription;
        }
        if ((i & 4) != 0) {
            function0 = auraMultiIconButtonPillEntry.onClick;
        }
        if ((i & 8) != 0) {
            b6a = auraMultiIconButtonPillEntry.iconTint;
        }
        if ((i & 16) != 0) {
            z = auraMultiIconButtonPillEntry.enabled;
        }
        return auraMultiIconButtonPillEntry.m2435copy8wvRk98(aVy, str, function0, b6a, z);
    }

    public final AVy component1() {
        return this.iconPainter;
    }

    public final String component2() {
        return this.contentDescription;
    }

    public final Function0<Unit> component3() {
        return this.onClick;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final B6A m2434component4QN2ZGVo() {
        return this.iconTint;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final AVy getIconPainter() {
        return this.iconPainter;
    }

    /* renamed from: getIconTint-QN2ZGVo, reason: not valid java name */
    public final B6A m2436getIconTintQN2ZGVo() {
        return this.iconTint;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.onClick, AnonymousClass005.A0I(this.contentDescription, AnonymousClass005.A0E(this.iconPainter))) + AnonymousClass007.A07(this.iconTint)) * 31, this.enabled);
    }

    public AuraMultiIconButtonPillEntry(AVy aVy, String str, Function0<Unit> function0, B6A b6a, boolean z) {
        AnonymousClass005.A0x(aVy, str, function0);
        this.iconPainter = aVy;
        this.contentDescription = str;
        this.onClick = function0;
        this.iconTint = b6a;
        this.enabled = z;
    }

    /* renamed from: copy-8wvRk98, reason: not valid java name */
    public final AuraMultiIconButtonPillEntry m2435copy8wvRk98(AVy aVy, String str, Function0<Unit> function0, B6A b6a, boolean z) {
        AnonymousClass005.A0x(aVy, str, function0);
        return new AuraMultiIconButtonPillEntry(aVy, str, function0, b6a, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraMultiIconButtonPillEntry(AVy aVy, String str, Function0 function0, B6A b6a, boolean z, int i, C06H c06h) {
        this(aVy, str, function0, (i & 8) != 0 ? null : b6a, (i & 16) != 0 ? true : z);
    }

    public /* synthetic */ AuraMultiIconButtonPillEntry(AVy aVy, String str, Function0 function0, B6A b6a, boolean z, C06H c06h) {
        this(aVy, str, function0, b6a, z);
    }
}
