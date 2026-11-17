package com.facebook.aura.header.view;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes.dex */
public interface HeaderButtonContent {

    public final class Icon implements HeaderButtonContent {
        public static final int $stable = 0;
        public final int description;
        public final boolean destructive;
        public final boolean enabled;
        public final int res;
        public final boolean suppressPressHaptic;

        public final int getDescription() {
            return this.description;
        }

        public final boolean getDestructive() {
            return this.destructive;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getRes() {
            return this.res;
        }

        public final boolean getSuppressPressHaptic() {
            return this.suppressPressHaptic;
        }

        public Icon(int i, int i2, boolean z, boolean z2, boolean z3) {
            this.res = i;
            this.description = i2;
            this.suppressPressHaptic = z;
            this.destructive = z2;
            this.enabled = z3;
        }

        public /* synthetic */ Icon(int i, int i2, boolean z, boolean z2, boolean z3, int i3, C06H c06h) {
            this(i, i2, AnonymousClass005.A1O(i3, z), AnonymousClass005.A1P(i3, z2), (i3 & 16) != 0 ? true : z3);
        }
    }
}
