package com.facebook.common.json;

import android.net.Uri;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: classes6.dex */
public class UriDeserializer extends FromStringDeserializer<Uri> {
    public static final long serialVersionUID = 1;

    public UriDeserializer() {
        super(Uri.class);
    }
}
