package com.facebook.aura.sharedcontent;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface SharedContentUiState {

    public final class Error extends C06G implements SharedContentUiState {
        public static final int $stable = 0;
        public final int messageRes;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && this.messageRes == ((Error) obj).messageRes);
        }

        public static /* synthetic */ Error copy$default(Error error, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = error.messageRes;
            }
            return new Error(i);
        }

        public final int component1() {
            return this.messageRes;
        }

        public final Error copy(int i) {
            return new Error(i);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public int hashCode() {
            return this.messageRes;
        }

        public Error(int i) {
            this.messageRes = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loaded extends C06G implements SharedContentUiState {
        public static final int $stable = 0;
        public final String displayName;
        public final boolean injectIabHeader;
        public final boolean isSaved;
        public final boolean saveInFlight;
        public final String slug;
        public final SharedContentType type;
        public final String webViewUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (this.type != loaded.type || !C7384Etj.areEqual(this.slug, loaded.slug) || !C7384Etj.areEqual(this.displayName, loaded.displayName) || !C7384Etj.areEqual(this.webViewUrl, loaded.webViewUrl) || this.isSaved != loaded.isSaved || this.saveInFlight != loaded.saveInFlight || this.injectIabHeader != loaded.injectIabHeader) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, SharedContentType sharedContentType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                sharedContentType = loaded.type;
            }
            if ((i & 2) != 0) {
                str = loaded.slug;
            }
            if ((i & 4) != 0) {
                str2 = loaded.displayName;
            }
            if ((i & 8) != 0) {
                str3 = loaded.webViewUrl;
            }
            if ((i & 16) != 0) {
                z = loaded.isSaved;
            }
            if ((i & 32) != 0) {
                z2 = loaded.saveInFlight;
            }
            if ((i & 64) != 0) {
                z3 = loaded.injectIabHeader;
            }
            return loaded.copy(sharedContentType, str, str2, str3, z, z2, z3);
        }

        public final SharedContentType component1() {
            return this.type;
        }

        public final String component2() {
            return this.slug;
        }

        public final String component3() {
            return this.displayName;
        }

        public final String component4() {
            return this.webViewUrl;
        }

        public final boolean component5() {
            return this.isSaved;
        }

        public final boolean component6() {
            return this.saveInFlight;
        }

        public final boolean component7() {
            return this.injectIabHeader;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean getInjectIabHeader() {
            return this.injectIabHeader;
        }

        public final boolean getSaveInFlight() {
            return this.saveInFlight;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final SharedContentType getType() {
            return this.type;
        }

        public final String getWebViewUrl() {
            return this.webViewUrl;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.webViewUrl, AnonymousClass005.A0I(this.displayName, AnonymousClass005.A0I(this.slug, AnonymousClass005.A0E(this.type)))), this.isSaved), this.saveInFlight), this.injectIabHeader);
        }

        public final boolean isSaved() {
            return this.isSaved;
        }

        public /* synthetic */ Loaded(SharedContentType sharedContentType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
            this(sharedContentType, str, str2, str3, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, C3cH.A1M(i, z3));
        }

        public final Loaded copy(SharedContentType sharedContentType, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
            AnonymousClass005.A14(sharedContentType, str, str2, str3);
            return new Loaded(sharedContentType, str, str2, str3, z, z2, z3);
        }

        public String toString() {
            return super.toString();
        }

        public Loaded(SharedContentType sharedContentType, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
            AnonymousClass005.A14(sharedContentType, str, str2, str3);
            this.type = sharedContentType;
            this.slug = str;
            this.displayName = str2;
            this.webViewUrl = str3;
            this.isSaved = z;
            this.saveInFlight = z2;
            this.injectIabHeader = z3;
        }
    }

    public final class Loading implements SharedContentUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -914729727;
        }
    }
}
