package com.facebook.aura.conversation.viewmodel;

import X.C06H;

/* loaded from: classes.dex */
public abstract class HatchDocumentType {
    public static final int $stable = 8;

    public final class Generic extends HatchDocumentType {
        public static final int $stable = 0;
        public static final Generic INSTANCE = new Generic();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Generic);
        }

        public String toString() {
            return "Generic";
        }

        public int hashCode() {
            return 1177838681;
        }
    }

    public final class Html extends HatchDocumentType {
        public static final int $stable = 0;
        public static final Html INSTANCE = new Html();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Html);
        }

        public String toString() {
            return "Html";
        }

        public int hashCode() {
            return 336432233;
        }
    }

    public final class Markdown extends HatchDocumentType {
        public static final int $stable = 0;
        public static final Markdown INSTANCE = new Markdown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Markdown);
        }

        public String toString() {
            return "Markdown";
        }

        public int hashCode() {
            return 589820589;
        }
    }

    public /* synthetic */ HatchDocumentType(C06H c06h) {
    }

    public HatchDocumentType() {
    }
}
