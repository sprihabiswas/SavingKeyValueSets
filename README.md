# SavingKeyValueSets
* How to use the SharedPreferences APIs to store and retrieve simple values (Android) (Part of the series Mastering Android)
* If you have a relatively small collection of key-values that you'd like to save, you should use the SharedPreferences APIs. A SharedPreferences object points to a file containing key-value pairs and provides simple methods to read and write them. Each SharedPreferences file is managed by the framework and can be private or shared.

* The SharedPreferences APIs are only for reading and writing key-value pairs and you should not confuse them with the Preference APIs, which help you build a user interface for your app settings (although they use SharedPreferences as their implementation to save the app settings)

* In this application, what the user types in the box is saved in the SharedPreference and then retrieved and displayed below on button click.
