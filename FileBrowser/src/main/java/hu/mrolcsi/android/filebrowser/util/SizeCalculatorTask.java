/*
 * Copyright 2018 Roland Matusinka <http://github.com/mrolcsi>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hu.mrolcsi.android.filebrowser.util;

import android.os.AsyncTask;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Matusinka Roland
 * Date: 2015.08.06.
 * Time: 16:26
 */

public class SizeCalculatorTask extends AsyncTask<File, Long, Long> {

  @Override
  protected Long doInBackground(File... files) {

    // if input is a file (not directory) return its size
    if (files[0].isFile()) {
      return files[0].length();
    }

    // if it's a directory, calculate size recursively
    return FileUtils.dirSize(files[0]);
  }
}
