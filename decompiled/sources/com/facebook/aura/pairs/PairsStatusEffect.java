package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsStatusEffect {

    public final class Leave implements PairsStatusEffect {
        public static final int $stable = 0;
        public final Integer toast;
        public final String toastName;

        public Leave(Integer num, String str) {
            C7384Etj.A0Y(str, 1);
            this.toast = num;
            this.toastName = str;
        }

        public final Integer getToast() {
            return this.toast;
        }

        public final String getToastName() {
            return this.toastName;
        }
    }

    public final class Message implements PairsStatusEffect {
        public static final int $stable = 0;
        public final int res;

        public final int getRes() {
            return this.res;
        }

        public Message(int i) {
            this.res = i;
        }
    }
}
