package com.facebook.aura.vmbrowser.runtime;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C8j2;
import X.Ey9;
import X.FGI;
import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes2.dex */
public interface VmBrowserJarvisPath extends JarvisPath.Extension {

    public final class BrowserTaskClipboard implements VmBrowserJarvisPath {
        public static final int $stable = 0;
        public final Action action;
        public final String encodedTaskId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Action {
            public static final /* synthetic */ Ey9 $ENTRIES;
            public static final /* synthetic */ Action[] $VALUES;
            public static final Action COPY;
            public static final Action PASTE;
            public final String suffix;

            static {
                Action action = new Action("COPY", 0, "copy");
                COPY = action;
                Action action2 = new Action("PASTE", 1, "paste");
                PASTE = action2;
                Action[] actionArr = {action, action2};
                $VALUES = actionArr;
                $ENTRIES = C3cG.A0w(actionArr);
            }

            public static Ey9<Action> getEntries() {
                return $ENTRIES;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            public final String getSuffix() {
                return this.suffix;
            }

            public Action(String str, int i, String str2) {
                this.suffix = str2;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BrowserTaskClipboard) {
                    BrowserTaskClipboard browserTaskClipboard = (BrowserTaskClipboard) obj;
                    if (!C7384Etj.areEqual(this.encodedTaskId, browserTaskClipboard.encodedTaskId) || this.action != browserTaskClipboard.action) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ BrowserTaskClipboard copy$default(BrowserTaskClipboard browserTaskClipboard, String str, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserTaskClipboard.encodedTaskId;
            }
            if ((i & 2) != 0) {
                action = browserTaskClipboard.action;
            }
            AnonymousClass003.A0u(str, action);
            return new BrowserTaskClipboard(str, action);
        }

        public final String component1() {
            return this.encodedTaskId;
        }

        public final Action component2() {
            return this.action;
        }

        public final Action getAction() {
            return this.action;
        }

        public final String getEncodedTaskId() {
            return this.encodedTaskId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0d("api/browser-task/", this.encodedTaskId, "/clipboard/", this.action.getSuffix());
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.action, AnonymousClass001.A0G(this.encodedTaskId));
        }

        public String toString() {
            String str = this.encodedTaskId;
            return C3cJ.A0L(this.action, C8j2.A00(7), C3cI.A0x("BrowserTaskClipboard(encodedTaskId=", str));
        }

        public BrowserTaskClipboard(String str, Action action) {
            AnonymousClass003.A0u(str, action);
            this.encodedTaskId = str;
            this.action = action;
        }

        public final BrowserTaskClipboard copy(String str, Action action) {
            AnonymousClass003.A0u(str, action);
            return new BrowserTaskClipboard(str, action);
        }
    }
}
