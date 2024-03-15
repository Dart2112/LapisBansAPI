/*
 * Copyright 2024 Benjamin Martin
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

package net.lapismc.lapisbans.api;

/**
 * This class stores the API object from the plugin
 */
public class LapisBansAPIStorage {

    private static LapisBansAPI api;

    /**
     * Get an instance of the API class from the plugin
     * @return an instance of the LapisBansAPI interface
     */
    public static LapisBansAPI getAPI() {
        return api;
    }

    /**
     * Do not use, this is used by LapisBans to store an instance of the API here for you to get
     *
     * @param api The API instance to be stored
     */
    public static void setAPI(LapisBansAPI api) {
        LapisBansAPIStorage.api = api;
    }

}
