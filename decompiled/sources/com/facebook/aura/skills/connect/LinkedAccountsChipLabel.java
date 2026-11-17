package com.facebook.aura.skills.connect;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface LinkedAccountsChipLabel {

    public final class AccountCount extends C06G implements LinkedAccountsChipLabel {
        public static final int $stable = 0;
        public final int count;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AccountCount) && this.count == ((AccountCount) obj).count);
        }

        public static /* synthetic */ AccountCount copy$default(AccountCount accountCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = accountCount.count;
            }
            return new AccountCount(i);
        }

        public final int component1() {
            return this.count;
        }

        public final AccountCount copy(int i) {
            return new AccountCount(i);
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return this.count;
        }

        public AccountCount(int i) {
            this.count = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AccountName extends C06G implements LinkedAccountsChipLabel {
        public static final int $stable = 0;
        public final String name;

        public AccountName(String str) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
        }

        public final AccountName copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new AccountName(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AccountName) && C7384Etj.areEqual(this.name, ((AccountName) obj).name));
        }

        public static /* synthetic */ AccountName copy$default(AccountName accountName, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountName.name;
            }
            C7384Etj.A0Y(str, 0);
            return new AccountName(str);
        }

        public final String component1() {
            return this.name;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ChooseAccounts implements LinkedAccountsChipLabel {
        public static final int $stable = 0;
        public static final ChooseAccounts INSTANCE = new ChooseAccounts();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChooseAccounts);
        }

        public String toString() {
            return "ChooseAccounts";
        }

        public int hashCode() {
            return -342634270;
        }
    }
}
