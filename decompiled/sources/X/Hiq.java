package X;

import java.util.Map;

/* loaded from: classes6.dex */
public enum Hiq {
    /* JADX INFO: Fake field, exist only in values array */
    target,
    /* JADX INFO: Fake field, exist only in values array */
    root,
    nth_child,
    /* JADX INFO: Fake field, exist only in values array */
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    first_child,
    /* JADX INFO: Fake field, exist only in values array */
    last_child,
    /* JADX INFO: Fake field, exist only in values array */
    first_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    last_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    only_child,
    /* JADX INFO: Fake field, exist only in values array */
    only_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    empty,
    /* JADX INFO: Fake field, exist only in values array */
    not,
    /* JADX INFO: Fake field, exist only in values array */
    lang,
    /* JADX INFO: Fake field, exist only in values array */
    link,
    /* JADX INFO: Fake field, exist only in values array */
    visited,
    /* JADX INFO: Fake field, exist only in values array */
    hover,
    /* JADX INFO: Fake field, exist only in values array */
    active,
    /* JADX INFO: Fake field, exist only in values array */
    focus,
    /* JADX INFO: Fake field, exist only in values array */
    enabled,
    /* JADX INFO: Fake field, exist only in values array */
    disabled,
    /* JADX INFO: Fake field, exist only in values array */
    checked,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    UNSUPPORTED;

    public static final Map<String, Hiq> A00 = BV4.A0u();

    static {
        for (Hiq hiq : values()) {
            if (hiq != UNSUPPORTED) {
                A00.put(hiq.name().replace('_', '-'), hiq);
            }
        }
    }
}
