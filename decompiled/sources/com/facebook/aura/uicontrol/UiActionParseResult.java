package com.facebook.aura.uicontrol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public interface UiActionParseResult {

    public final class Failed extends C06G implements UiActionParseResult {
        public final String code;
        public final String message;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.code, failed.code) || !C7384Etj.areEqual(this.message, failed.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.code;
            }
            if ((i & 2) != 0) {
                str2 = failed.message;
            }
            AnonymousClass003.A0u(str, str2);
            return new Failed(str, str2);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.message, AnonymousClass001.A0G(this.code));
        }

        public Failed(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.code = str;
            this.message = str2;
        }

        public final Failed copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Failed(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Parsed extends C06G implements UiActionParseResult {
        public final UiAction action;
        public final UiActionMode mode;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Parsed) {
                    Parsed parsed = (Parsed) obj;
                    if (!C7384Etj.areEqual(this.action, parsed.action) || this.mode != parsed.mode) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Parsed copy$default(Parsed parsed, UiAction uiAction, UiActionMode uiActionMode, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAction = parsed.action;
            }
            if ((i & 2) != 0) {
                uiActionMode = parsed.mode;
            }
            AnonymousClass003.A0u(uiAction, uiActionMode);
            return new Parsed(uiAction, uiActionMode);
        }

        public final UiAction component1() {
            return this.action;
        }

        public final UiActionMode component2() {
            return this.mode;
        }

        public final UiAction getAction() {
            return this.action;
        }

        public final UiActionMode getMode() {
            return this.mode;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.mode, AnonymousClass005.A0E(this.action));
        }

        public Parsed(UiAction uiAction, UiActionMode uiActionMode) {
            AnonymousClass003.A0u(uiAction, uiActionMode);
            this.action = uiAction;
            this.mode = uiActionMode;
        }

        public final Parsed copy(UiAction uiAction, UiActionMode uiActionMode) {
            AnonymousClass003.A0u(uiAction, uiActionMode);
            return new Parsed(uiAction, uiActionMode);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Parsed(UiAction uiAction, UiActionMode uiActionMode, int i, C06H c06h) {
            this(uiAction, (i & 2) != 0 ? UiActionMode.PERFORM : uiActionMode);
        }
    }
}
