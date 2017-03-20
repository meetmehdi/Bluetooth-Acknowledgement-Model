/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pitb.bluetoothmodel.constants;

/**
 * Defines several constants used between {@link com.pitb.bluetoothmodel.com.pitb.bluetoothmodel.BluetoothChatService} and the UI.
 */
public interface Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;
    public static final int MESSAGE_TOAST_SENT_ACKNOWLEDGMENT = 6;
    public static final int MESSAGE_TOAST_RECIEVED_ACKNOWLEDGMENT = 7;
    public static final int MESSAGE_DIALOG_PROGRESS = 8;


    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";
    public static final String HEADER = "~" + "~" + "~" + "~" + "~";

    public static final String dataToSend = "{\n" +
            "\t\"name\": \"checker five\",\n" +
            "\t\"cnic\": \"09097-1279991-2\",\n" +
            "\t\"number\": \"12132512991\",\n" +
            "\t\"image_enum_name\": \"surveyer_2017-02-22 21:43:27\",\n" +
            "\t\"image_enum\": \"\\/9j\\/4AAQSkZJRgABAQAAAQABAAD\\/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH\\/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH\\/wAARCACgAFoDASIA\\nAhEBAxEB\\/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL\\/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6\\/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL\\/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6\\/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq\\/Q5mHcZz8g+m47myHejpn8Mf8B3\\/X+6P\\/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83\\/AAD8MNIPl5zluc\\/xchd33qAPbn8e29V6N\\/s\\/h13Eq71JQBGMDdntj1\\/hZ+nP\\n8WTnnp3JLmnf\\/E+v\\/wBl+v8A49Tf5\\/5\\/Hr\\/nzKkoAZzjH49vXr9\\/\\/J53bvmp9RjnP4fj\\/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN\\/sd8892Dcgzz+X\\/jz99x759c9MNnIB0OPbrnHy+YP72O3bt\\/EwEhMl\\nADOcY\\/Ht69fv\\/wCTzu3fNS7h\\/krz1\\/2vof8AEk4aP4uem314O5x\\/e77c+oONxyd9SUAR9M\\/\\/AFj\\/\\nABPyd3\\/fXryVLEL5hkoooAjHfOfy95P7w9B39Rk5UUfn\\/kv79flDfVgCSyuSo4z9fpnmTP8AF3wM\\n+uBub5jSfzHGfbL+\\/UdSevzMNxwXIBJUfqPTH83Hqf7vp3PLESVJRQBGOjD\\/AHfXqDJ23EH7rY54\\n4DFixwfn+fvIp4w390diOvUh3qSigCP1Hpj+bj1P9307nliJKM+\\/6\\/8A2ygdDj265x8vmD+9jt27\\nfxMBITJQAVDzz93r325+9J1zzn685681NRQAUVH\\/AC\\/+uw\\/9B65OeWOCytkHQ9\\/T35b64wBu+fJy\\nTjkFqAJKKKKACmLnn8P5vz\\/PnPr8z5OX0UAFR\\/zHGfbL+\\/UdSevzMNxwXMlFABRRRQBH2PT6nPZn\\n\\/wCBDoG\\/Iklg+ZKjHfOfy95P7w9B39Rk5UVJQBGOh9OOfxk77h69eOv3jnDSUVGO+c\\/l7yf3h6Dv\\n6jJyooAB399vfry49ec\\/jjB55MhkoooAKKKKACiiigCMdDjtt\\/nJjJDdDs49ME7jiXMlFFABRRRQ\\nAUUUUAFFFFABRRRQBH+ucY\\/T1\\/vc5+oxt\\/eZkoooAKKKKACiiigAooooAKKj6Z\\/DH\\/Ad\\/wBf7o\\/8\\nd3btvMlABRRUY6H\\/APXnmT2bsPf+MZJyaAJKKKKACiox3\\/D+Z9WHUleR3P3i2DR+A+vPpn1z0+f6\\n8ff5oAkooooAKKKKAG\\/\\/ABPr\\/wDZfr\\/49TqKKACiiigAooqP\\/P8A6F7\\/AOOMvksd5IBJRRRQAUUU\\nUAFFRj+L6cnv9589W\\/iCDHcgLlmbO4H4\\/hnr8\\/r\\/AMC985zzvoAkooooAKKKKACiio\\/UemP5uPU\\/\\n3fTueWIkoAkqP+f+fx6\\/58yjtjB\\/JvU89f8AZXAzxkjOAcyUAR4+nHuPf3PTYOvqOuHpNxGev5j1\\nk9VJ\\/UnryT81S0UAR8fqPy3NnOf9nH\\/j2ed9H\\/6\\/\\/r\\/\\/AF\\/\\/ACJR64PXHPPOCw7n0H8R+8V+Y4oX\\njP8AF0+8PUyryMjG73yeE5BXeQCSio\\/Xn09e+\\/GeGzuwMdxk53bmyDGODzxt5Pq2R1+XoOuc\\/dHI\\naQgElMXBHT07Z4y45y3ovGe525GFYoOhznt6er56++Pv89cfNuo\\/z\\/j1\\/Hr+P\\/LSgCSo\\/X\\/P94Hr\\n0yMHkk8sMhhI5kqId\\/7vHcYxvYeuW\\/DkZLEZINAEtFR8c85xjuf78i9ckj7q5z3JGTtZyvOMfj29\\nev3\\/APJ53bvmoAT\\/AOv3917bv\\/ZTn\\/azkyVGoyH9yvOBx8zjcOfbI9NzDdlS5M+\\/6\\/X\\/AKa\\/T8yM\\n8ZIADBBK\\/d4HfgbnUZ5PBOT16dSzHcADPH+H8LyKT09hx6kBg23ewD156kEEsc4Ly8ncT83P3Tzl\\nlHzMGLC8l8gfLj0xglgMY6dNx3ZwMjls0AHG0kdBgd+5cc7uV\\/1eQvJOeoZVoXAznK\\/1+Zh79Qgb\\nnnDFSSwY0o6MBlug6Z4BmBIAZuAFDEnrweSm8ouDnGASVJ5wPvyf3jn+EY69hnDbqABV+\\/36ccnu\\n2eh4xsGepyRlmKtQOQ\\/tt6nH8UgH8XU7Af73LLuIG+kGAGwfxJxjLOOmO4Un5jngMxYgkr6456DH\\nOD8zY7+2RnjbnBLCXIAfn\\/kv79flDfVgCSyuSDo3OduM8H+9IpJ5\\/ugevXkgNvJ\\/eHoV9eTucbs\\/\\n8Ax1HUfM2d9L2K54z\\/tf3mz2x\\/CMfX7wAegA9vfrz67f\\/rdc\\/j+8pB0b\\/gLH85MHg\\/xYGAP9nJYh\\nsi\\/xZbGO+DkndKOByeu3r8uCx3FlORVzkcdskA8YL7uo9Npxk9WDEHLkAaONwAIAxtbJ7s3OdxIz\\nkfe7Z4BJo34yPm446ehkH90\\/zPfk\\/epRuIYA5PQHb97l14DHuMFec5Yckh2KbwCQU5BweD1Bcehz\\nyD3P1OQTgqnJdct7+bXwtw\\/vdV33aXvO85Z83LdWv83rbTrf1\\/zep\\/\\/Z\\n\",\n" +
            "\t\"imei_number\": \"DC:66:72:58:7E:BD\",\n" +
            "\t\"id\": \"1208\",\n" +
            "\t\"firm_id\": \"0\",\n" +
            "\t\"server_app_version\": 12,\n" +
            "\t\"enum_app_version\": 13,\n" +
            "\t\"enum_app_version_name\": \"2.5.1\",\n" +
            "\t\"base_url\": \"http:\\/\\/58.65.177.222:5155\\/api\",\n" +
            "\t\"enum_validate\": 1,\n" +
            "\t\"supervisor_id\": 200,\n" +
            "\t\"is_validate_locality\": 0,\n" +
            "\t\"is_hard_locality\": 0,\n" +
            "\t\"hard_area_batch_size\": 3,\n" +
            "\t\"surveys\": [{\n" +
            "\t\"geographic_location\": {\n" +
            "\t\t\"region\": \"rural\",\n" +
            "\t\t\"province_id\": \"102\",\n" +
            "\t\t\"province_name\": \"BALUCHISTAN\",\n" +
            "\t\t\"district_id\": \"203\",\n" +
            "\t\t\"district_name\": \"KILLA SAIFULLAH\",\n" +
            "\t\t\"tehsil_id\": \"310\",\n" +
            "\t\t\"tehsil_name\": \"LOI BAND\",\n" +
            "\t\t\"uc_id\": \"464\",\n" +
            "\t\t\"uc_name\": \"LOI BAND\",\n" +
            "\t\t\"is_gps_exempted\": 0,\n" +
            "\t\t\"is_hard\": 0,\n" +
            "\t\t\"is_validate\": 0,\n" +
            "\t\t\"batch_size\": 1,\n" +
            "\t\t\"village_id\": \"3948\",\n" +
            "\t\t\"village_name\": \"kuram_training\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"po_id\": \"40\",\n" +
            "\t\t\"po_name\": \"GPO\"\n" +
            "\t},\n" +
            "\t\"contact_details\": {\n" +
            "\t\t\"total_rosters\": 0,\n" +
            "\t\t\"name_of_head\": \"tester\",\n" +
            "\t\t\"address_of_house\": \"qwerty\",\n" +
            "\t\t\"mobile_number\": \"12121221212\",\n" +
            "\t\t\"alternative_contact\": \"21212131313\",\n" +
            "\t\t\"mother_lang_id\": \"218\",\n" +
            "\t\t\"bisp_benificiary\": \"no\"\n" +
            "\t},\n" +
            "\t\"household_info\": {\n" +
            "\t\t\"occupacy_status\": \"63\",\n" +
            "\t\t\"wall_material\": \"68\",\n" +
            "\t\t\"roof_material\": \"73\",\n" +
            "\t\t\"cooking_fuel\": \"78\",\n" +
            "\t\t\"toilet\": \"85\",\n" +
            "\t\t\"drinking_water\": \"91\",\n" +
            "\t\t\"electricity\": \"102\",\n" +
            "\t\t\"gas\": \"105\",\n" +
            "\t\t\"landline\": \"108\",\n" +
            "\t\t\"land_unit\": \"0\",\n" +
            "\t\t\"number_of_rooms\": \"6\",\n" +
            "\t\t\"animal\": \"no\",\n" +
            "\t\t\"buffalo\": \"0\",\n" +
            "\t\t\"cow\": \"0\",\n" +
            "\t\t\"horse\": \"0\",\n" +
            "\t\t\"camel\": \"0\",\n" +
            "\t\t\"goat\": \"0\",\n" +
            "\t\t\"land_number\": \"0\",\n" +
            "\t\t\"household_agriculture_land\": \"no\",\n" +
            "\t\t\"heater\": \"no\",\n" +
            "\t\t\"washing_machine\": \"no\",\n" +
            "\t\t\"geyser\": \"no\",\n" +
            "\t\t\"air_cooler\": \"no\",\n" +
            "\t\t\"air_conditioner\": \"no\",\n" +
            "\t\t\"fan\": \"no\",\n" +
            "\t\t\"cooking_range\": \"no\",\n" +
            "\t\t\"cooking_stove\": \"no\",\n" +
            "\t\t\"tv\": \"no\",\n" +
            "\t\t\"vcr\": \"no\",\n" +
            "\t\t\"refrigerator\": \"no\",\n" +
            "\t\t\"freezer\": \"no\",\n" +
            "\t\t\"generator\": \"no\",\n" +
            "\t\t\"car\": \"no\",\n" +
            "\t\t\"mobile\": \"no\",\n" +
            "\t\t\"tractor\": \"no\",\n" +
            "\t\t\"motorcycle\": \"no\",\n" +
            "\t\t\"internet\": \"no\",\n" +
            "\t\t\"computer\": \"no\",\n" +
            "\t\t\"sewing\": \"no\"\n" +
            "\t},\n" +
            "\t\"miscellaneous\": {\n" +
            "\t\t\"taken_loan\": \"211\",\n" +
            "\t\t\"satisfaction_level\": \"178\",\n" +
            "\t\t\"resolve_complaint\": \"165\",\n" +
            "\t\t\"resolve_complaint_govt\": \"171\",\n" +
            "\t\t\"infant_death\": \"no\",\n" +
            "\t\t\"defence_job\": \"no\",\n" +
            "\t\t\"migration\": \"no\",\n" +
            "\t\t\"financial_assistance\": \"no\"\n" +
            "\t},\n" +
            "\t\"pictures\": {\n" +
            "\t\t\"image_benificiary_name\": \"benificiary_2017-02-22 21:46:15\",\n" +
            "\t\t\"image_benificiary\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\",\n" +
            "\t\t\"image_household_name\": \"household_2017-02-22 21:44:50\",\n" +
            "\t\t\"image_household\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\"\n" +
            "\t},\n" +
            "\t\"survey_information\": {\n" +
            "\t\t\"date\": \"2017-02-22\",\n" +
            "\t\t\"time\": \"21:46:22\",\n" +
            "\t\t\"start_time\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"end_time\": \"2017-02-22 21:46:22\",\n" +
            "\t\t\"imei_number\": \"DC:66:72:58:7E:BD\",\n" +
            "\t\t\"enumerator_name\": \"checker four\",\n" +
            "\t\t\"visit_status_id\": \"3\",\n" +
            "\t\t\"visit_status_reason\": \"\",\n" +
            "\t\t\"complete_form\": \"yes\",\n" +
            "\t\t\"average_roster_time\": 15,\n" +
            "\t\t\"uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_1\",\n" +
            "\t\t\"form_no\": \"sami_1\",\n" +
            "\t\t\"form_no_not_at_home\": \"\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"survey_accepted\": \"\",\n" +
            "\t\t\"validation_percentage\": \"0\",\n" +
            "\t\t\"survey_verified\": \"\",\n" +
            "\t\t\"batch_name\": \"1208_2017-02-22_13-43-21_bispData.json\",\n" +
            "\t\t\"is_selected_at_random\": 0,\n" +
            "\t\t\"is_selected_for_resurvey\": 0,\n" +
            "\t\t\"contact_detail_start\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"contact_detail_end\": \"2017-02-22 21:44:51\",\n" +
            "\t\t\"household_start\": \"2017-02-22 21:45:14\",\n" +
            "\t\t\"household_end\": \"2017-02-22 21:45:34\",\n" +
            "\t\t\"miscellaneous_start\": \"2017-02-22 21:45:35\",\n" +
            "\t\t\"miscellaneous_end\": \"2017-02-22 21:45:44\",\n" +
            "\t\t\"diff_contact_detail\": 25,\n" +
            "\t\t\"diff_household\": 20,\n" +
            "\t\t\"diff_miscellaneous\": 9\n" +
            "\t},\n" +
            "\t\"roster\": [{\n" +
            "\t\t\"roster_relational_id\": \"1\",\n" +
            "\t\t\"name_of_member\": \"tester\",\n" +
            "\t\t\"relation_to_household_id\": \"186\",\n" +
            "\t\t\"gender\": \"male\",\n" +
            "\t\t\"date_of_birth\": \"1 Feb 1999\",\n" +
            "\t\t\"date_of_birth_var\": \"1-2-1999\",\n" +
            "\t\t\"age_month\": 0,\n" +
            "\t\t\"age_year\": 18,\n" +
            "\t\t\"age\": 18,\n" +
            "\t\t\"merital_status\": \"200\",\n" +
            "\t\t\"cnic\": \"\",\n" +
            "\t\t\"cnic_option\": \"1\",\n" +
            "\t\t\"is_bisp_beneficiary\": \"\",\n" +
            "\t\t\"bform\": \"\",\n" +
            "\t\t\"id_spouse\": \"0\",\n" +
            "\t\t\"id_father\": \"-1\",\n" +
            "\t\t\"id_mother\": \"-1\",\n" +
            "\t\t\"respondant\": \"yes\",\n" +
            "\t\t\"disability\": \"6\",\n" +
            "\t\t\"chronic_disease\": \"15\",\n" +
            "\t\t\"language\": \"no\",\n" +
            "\t\t\"attended_school\": \"25\",\n" +
            "\t\t\"higher_education\": \"0\",\n" +
            "\t\t\"work_activity\": \"51\",\n" +
            "\t\t\"hours_worked\": \"0\",\n" +
            "\t\t\"employment_status\": \"217\",\n" +
            "\t\t\"survey_type\": \"0\",\n" +
            "\t\t\"survey_form_no\": \"sami_1\",\n" +
            "\t\t\"survey_uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_1\",\n" +
            "\t\t\"start\": \"2017-02-22 21:44:52\",\n" +
            "\t\t\"end\": \"2017-02-22 21:45:07\",\n" +
            "\t\t\"diff\": 15\n" +
            "\t}]\n" +
            "}, {\n" +
            "\t\"geographic_location\": {\n" +
            "\t\t\"region\": \"rural\",\n" +
            "\t\t\"province_id\": \"102\",\n" +
            "\t\t\"province_name\": \"BALUCHISTAN\",\n" +
            "\t\t\"district_id\": \"203\",\n" +
            "\t\t\"district_name\": \"KILLA SAIFULLAH\",\n" +
            "\t\t\"tehsil_id\": \"310\",\n" +
            "\t\t\"tehsil_name\": \"LOI BAND\",\n" +
            "\t\t\"uc_id\": \"464\",\n" +
            "\t\t\"uc_name\": \"LOI BAND\",\n" +
            "\t\t\"is_gps_exempted\": 0,\n" +
            "\t\t\"is_hard\": 0,\n" +
            "\t\t\"is_validate\": 0,\n" +
            "\t\t\"batch_size\": 1,\n" +
            "\t\t\"village_id\": \"3948\",\n" +
            "\t\t\"village_name\": \"kuram_training\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"po_id\": \"40\",\n" +
            "\t\t\"po_name\": \"GPO\"\n" +
            "\t},\n" +
            "\t\"contact_details\": {\n" +
            "\t\t\"total_rosters\": 0,\n" +
            "\t\t\"name_of_head\": \"tester\",\n" +
            "\t\t\"address_of_house\": \"qwerty\",\n" +
            "\t\t\"mobile_number\": \"12121221212\",\n" +
            "\t\t\"alternative_contact\": \"21212131313\",\n" +
            "\t\t\"mother_lang_id\": \"218\",\n" +
            "\t\t\"bisp_benificiary\": \"no\"\n" +
            "\t},\n" +
            "\t\"household_info\": {\n" +
            "\t\t\"occupacy_status\": \"63\",\n" +
            "\t\t\"wall_material\": \"68\",\n" +
            "\t\t\"roof_material\": \"73\",\n" +
            "\t\t\"cooking_fuel\": \"78\",\n" +
            "\t\t\"toilet\": \"85\",\n" +
            "\t\t\"drinking_water\": \"91\",\n" +
            "\t\t\"electricity\": \"102\",\n" +
            "\t\t\"gas\": \"105\",\n" +
            "\t\t\"landline\": \"108\",\n" +
            "\t\t\"land_unit\": \"0\",\n" +
            "\t\t\"number_of_rooms\": \"6\",\n" +
            "\t\t\"animal\": \"no\",\n" +
            "\t\t\"buffalo\": \"0\",\n" +
            "\t\t\"cow\": \"0\",\n" +
            "\t\t\"horse\": \"0\",\n" +
            "\t\t\"camel\": \"0\",\n" +
            "\t\t\"goat\": \"0\",\n" +
            "\t\t\"land_number\": \"0\",\n" +
            "\t\t\"household_agriculture_land\": \"no\",\n" +
            "\t\t\"heater\": \"no\",\n" +
            "\t\t\"washing_machine\": \"no\",\n" +
            "\t\t\"geyser\": \"no\",\n" +
            "\t\t\"air_cooler\": \"no\",\n" +
            "\t\t\"air_conditioner\": \"no\",\n" +
            "\t\t\"fan\": \"no\",\n" +
            "\t\t\"cooking_range\": \"no\",\n" +
            "\t\t\"cooking_stove\": \"no\",\n" +
            "\t\t\"tv\": \"no\",\n" +
            "\t\t\"vcr\": \"no\",\n" +
            "\t\t\"refrigerator\": \"no\",\n" +
            "\t\t\"freezer\": \"no\",\n" +
            "\t\t\"generator\": \"no\",\n" +
            "\t\t\"car\": \"no\",\n" +
            "\t\t\"mobile\": \"no\",\n" +
            "\t\t\"tractor\": \"no\",\n" +
            "\t\t\"motorcycle\": \"no\",\n" +
            "\t\t\"internet\": \"no\",\n" +
            "\t\t\"computer\": \"no\",\n" +
            "\t\t\"sewing\": \"no\"\n" +
            "\t},\n" +
            "\t\"miscellaneous\": {\n" +
            "\t\t\"taken_loan\": \"211\",\n" +
            "\t\t\"satisfaction_level\": \"178\",\n" +
            "\t\t\"resolve_complaint\": \"165\",\n" +
            "\t\t\"resolve_complaint_govt\": \"171\",\n" +
            "\t\t\"infant_death\": \"no\",\n" +
            "\t\t\"defence_job\": \"no\",\n" +
            "\t\t\"migration\": \"no\",\n" +
            "\t\t\"financial_assistance\": \"no\"\n" +
            "\t},\n" +
            "\t\"pictures\": {\n" +
            "\t\t\"image_benificiary_name\": \"benificiary_2017-02-22 21:46:15\",\n" +
            "\t\t\"image_benificiary\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\",\n" +
            "\t\t\"image_household_name\": \"household_2017-02-22 21:44:50\",\n" +
            "\t\t\"image_household\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\"\n" +
            "\t},\n" +
            "\t\"survey_information\": {\n" +
            "\t\t\"date\": \"2017-02-22\",\n" +
            "\t\t\"time\": \"21:46:22\",\n" +
            "\t\t\"start_time\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"end_time\": \"2017-02-22 21:46:22\",\n" +
            "\t\t\"imei_number\": \"DC:66:72:58:7E:BD\",\n" +
            "\t\t\"enumerator_name\": \"checker four\",\n" +
            "\t\t\"visit_status_id\": \"3\",\n" +
            "\t\t\"visit_status_reason\": \"\",\n" +
            "\t\t\"complete_form\": \"yes\",\n" +
            "\t\t\"average_roster_time\": 15,\n" +
            "\t\t\"uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_2\",\n" +
            "\t\t\"form_no\": \"sami_2\",\n" +
            "\t\t\"form_no_not_at_home\": \"\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"survey_accepted\": \"\",\n" +
            "\t\t\"validation_percentage\": \"0\",\n" +
            "\t\t\"survey_verified\": \"\",\n" +
            "\t\t\"batch_name\": \"1208_2017-02-22_13-43-21_bispData.json\",\n" +
            "\t\t\"is_selected_at_random\": 0,\n" +
            "\t\t\"is_selected_for_resurvey\": 0,\n" +
            "\t\t\"contact_detail_start\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"contact_detail_end\": \"2017-02-22 21:44:51\",\n" +
            "\t\t\"household_start\": \"2017-02-22 21:45:14\",\n" +
            "\t\t\"household_end\": \"2017-02-22 21:45:34\",\n" +
            "\t\t\"miscellaneous_start\": \"2017-02-22 21:45:35\",\n" +
            "\t\t\"miscellaneous_end\": \"2017-02-22 21:45:44\",\n" +
            "\t\t\"diff_contact_detail\": 25,\n" +
            "\t\t\"diff_household\": 20,\n" +
            "\t\t\"diff_miscellaneous\": 9\n" +
            "\t},\n" +
            "\t\"roster\": [{\n" +
            "\t\t\"roster_relational_id\": \"1\",\n" +
            "\t\t\"name_of_member\": \"tester\",\n" +
            "\t\t\"relation_to_household_id\": \"186\",\n" +
            "\t\t\"gender\": \"male\",\n" +
            "\t\t\"date_of_birth\": \"1 Feb 1999\",\n" +
            "\t\t\"date_of_birth_var\": \"1-2-1999\",\n" +
            "\t\t\"age_month\": 0,\n" +
            "\t\t\"age_year\": 18,\n" +
            "\t\t\"age\": 18,\n" +
            "\t\t\"merital_status\": \"200\",\n" +
            "\t\t\"cnic\": \"\",\n" +
            "\t\t\"cnic_option\": \"1\",\n" +
            "\t\t\"is_bisp_beneficiary\": \"\",\n" +
            "\t\t\"bform\": \"\",\n" +
            "\t\t\"id_spouse\": \"0\",\n" +
            "\t\t\"id_father\": \"-1\",\n" +
            "\t\t\"id_mother\": \"-1\",\n" +
            "\t\t\"respondant\": \"yes\",\n" +
            "\t\t\"disability\": \"6\",\n" +
            "\t\t\"chronic_disease\": \"15\",\n" +
            "\t\t\"language\": \"no\",\n" +
            "\t\t\"attended_school\": \"25\",\n" +
            "\t\t\"higher_education\": \"0\",\n" +
            "\t\t\"work_activity\": \"51\",\n" +
            "\t\t\"hours_worked\": \"0\",\n" +
            "\t\t\"employment_status\": \"217\",\n" +
            "\t\t\"survey_type\": \"0\",\n" +
            "\t\t\"survey_form_no\": \"sami_2\",\n" +
            "\t\t\"survey_uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_2\",\n" +
            "\t\t\"start\": \"2017-02-22 21:44:52\",\n" +
            "\t\t\"end\": \"2017-02-22 21:45:07\",\n" +
            "\t\t\"diff\": 15\n" +
            "\t}]\n" +
            "}, {\n" +
            "\t\"geographic_location\": {\n" +
            "\t\t\"region\": \"rural\",\n" +
            "\t\t\"province_id\": \"102\",\n" +
            "\t\t\"province_name\": \"BALUCHISTAN\",\n" +
            "\t\t\"district_id\": \"203\",\n" +
            "\t\t\"district_name\": \"KILLA SAIFULLAH\",\n" +
            "\t\t\"tehsil_id\": \"310\",\n" +
            "\t\t\"tehsil_name\": \"LOI BAND\",\n" +
            "\t\t\"uc_id\": \"464\",\n" +
            "\t\t\"uc_name\": \"LOI BAND\",\n" +
            "\t\t\"is_gps_exempted\": 0,\n" +
            "\t\t\"is_hard\": 0,\n" +
            "\t\t\"is_validate\": 0,\n" +
            "\t\t\"batch_size\": 1,\n" +
            "\t\t\"village_id\": \"3948\",\n" +
            "\t\t\"village_name\": \"kuram_training\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"po_id\": \"40\",\n" +
            "\t\t\"po_name\": \"GPO\"\n" +
            "\t},\n" +
            "\t\"contact_details\": {\n" +
            "\t\t\"total_rosters\": 0,\n" +
            "\t\t\"name_of_head\": \"tester\",\n" +
            "\t\t\"address_of_house\": \"qwerty\",\n" +
            "\t\t\"mobile_number\": \"12121221212\",\n" +
            "\t\t\"alternative_contact\": \"21212131313\",\n" +
            "\t\t\"mother_lang_id\": \"218\",\n" +
            "\t\t\"bisp_benificiary\": \"no\"\n" +
            "\t},\n" +
            "\t\"household_info\": {\n" +
            "\t\t\"occupacy_status\": \"63\",\n" +
            "\t\t\"wall_material\": \"68\",\n" +
            "\t\t\"roof_material\": \"73\",\n" +
            "\t\t\"cooking_fuel\": \"78\",\n" +
            "\t\t\"toilet\": \"85\",\n" +
            "\t\t\"drinking_water\": \"91\",\n" +
            "\t\t\"electricity\": \"102\",\n" +
            "\t\t\"gas\": \"105\",\n" +
            "\t\t\"landline\": \"108\",\n" +
            "\t\t\"land_unit\": \"0\",\n" +
            "\t\t\"number_of_rooms\": \"6\",\n" +
            "\t\t\"animal\": \"no\",\n" +
            "\t\t\"buffalo\": \"0\",\n" +
            "\t\t\"cow\": \"0\",\n" +
            "\t\t\"horse\": \"0\",\n" +
            "\t\t\"camel\": \"0\",\n" +
            "\t\t\"goat\": \"0\",\n" +
            "\t\t\"land_number\": \"0\",\n" +
            "\t\t\"household_agriculture_land\": \"no\",\n" +
            "\t\t\"heater\": \"no\",\n" +
            "\t\t\"washing_machine\": \"no\",\n" +
            "\t\t\"geyser\": \"no\",\n" +
            "\t\t\"air_cooler\": \"no\",\n" +
            "\t\t\"air_conditioner\": \"no\",\n" +
            "\t\t\"fan\": \"no\",\n" +
            "\t\t\"cooking_range\": \"no\",\n" +
            "\t\t\"cooking_stove\": \"no\",\n" +
            "\t\t\"tv\": \"no\",\n" +
            "\t\t\"vcr\": \"no\",\n" +
            "\t\t\"refrigerator\": \"no\",\n" +
            "\t\t\"freezer\": \"no\",\n" +
            "\t\t\"generator\": \"no\",\n" +
            "\t\t\"car\": \"no\",\n" +
            "\t\t\"mobile\": \"no\",\n" +
            "\t\t\"tractor\": \"no\",\n" +
            "\t\t\"motorcycle\": \"no\",\n" +
            "\t\t\"internet\": \"no\",\n" +
            "\t\t\"computer\": \"no\",\n" +
            "\t\t\"sewing\": \"no\"\n" +
            "\t},\n" +
            "\t\"miscellaneous\": {\n" +
            "\t\t\"taken_loan\": \"211\",\n" +
            "\t\t\"satisfaction_level\": \"178\",\n" +
            "\t\t\"resolve_complaint\": \"165\",\n" +
            "\t\t\"resolve_complaint_govt\": \"171\",\n" +
            "\t\t\"infant_death\": \"no\",\n" +
            "\t\t\"defence_job\": \"no\",\n" +
            "\t\t\"migration\": \"no\",\n" +
            "\t\t\"financial_assistance\": \"no\"\n" +
            "\t},\n" +
            "\t\"pictures\": {\n" +
            "\t\t\"image_benificiary_name\": \"benificiary_2017-02-22 21:46:15\",\n" +
            "\t\t\"image_benificiary\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\",\n" +
            "\t\t\"image_household_name\": \"household_2017-02-22 21:44:50\",\n" +
            "\t\t\"image_household\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\"\n" +
            "\t},\n" +
            "\t\"survey_information\": {\n" +
            "\t\t\"date\": \"2017-02-22\",\n" +
            "\t\t\"time\": \"21:46:22\",\n" +
            "\t\t\"start_time\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"end_time\": \"2017-02-22 21:46:22\",\n" +
            "\t\t\"imei_number\": \"DC:66:72:58:7E:BD\",\n" +
            "\t\t\"enumerator_name\": \"checker four\",\n" +
            "\t\t\"visit_status_id\": \"3\",\n" +
            "\t\t\"visit_status_reason\": \"\",\n" +
            "\t\t\"complete_form\": \"yes\",\n" +
            "\t\t\"average_roster_time\": 15,\n" +
            "\t\t\"uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_3\",\n" +
            "\t\t\"form_no\": \"sami_3\",\n" +
            "\t\t\"form_no_not_at_home\": \"\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"survey_accepted\": \"\",\n" +
            "\t\t\"validation_percentage\": \"0\",\n" +
            "\t\t\"survey_verified\": \"\",\n" +
            "\t\t\"batch_name\": \"1208_2017-02-22_13-43-21_bispData.json\",\n" +
            "\t\t\"is_selected_at_random\": 0,\n" +
            "\t\t\"is_selected_for_resurvey\": 0,\n" +
            "\t\t\"contact_detail_start\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"contact_detail_end\": \"2017-02-22 21:44:51\",\n" +
            "\t\t\"household_start\": \"2017-02-22 21:45:14\",\n" +
            "\t\t\"household_end\": \"2017-02-22 21:45:34\",\n" +
            "\t\t\"miscellaneous_start\": \"2017-02-22 21:45:35\",\n" +
            "\t\t\"miscellaneous_end\": \"2017-02-22 21:45:44\",\n" +
            "\t\t\"diff_contact_detail\": 25,\n" +
            "\t\t\"diff_household\": 20,\n" +
            "\t\t\"diff_miscellaneous\": 9\n" +
            "\t},\n" +
            "\t\"roster\": [{\n" +
            "\t\t\"roster_relational_id\": \"1\",\n" +
            "\t\t\"name_of_member\": \"tester\",\n" +
            "\t\t\"relation_to_household_id\": \"186\",\n" +
            "\t\t\"gender\": \"male\",\n" +
            "\t\t\"date_of_birth\": \"1 Feb 1999\",\n" +
            "\t\t\"date_of_birth_var\": \"1-2-1999\",\n" +
            "\t\t\"age_month\": 0,\n" +
            "\t\t\"age_year\": 18,\n" +
            "\t\t\"age\": 18,\n" +
            "\t\t\"merital_status\": \"200\",\n" +
            "\t\t\"cnic\": \"\",\n" +
            "\t\t\"cnic_option\": \"1\",\n" +
            "\t\t\"is_bisp_beneficiary\": \"\",\n" +
            "\t\t\"bform\": \"\",\n" +
            "\t\t\"id_spouse\": \"0\",\n" +
            "\t\t\"id_father\": \"-1\",\n" +
            "\t\t\"id_mother\": \"-1\",\n" +
            "\t\t\"respondant\": \"yes\",\n" +
            "\t\t\"disability\": \"6\",\n" +
            "\t\t\"chronic_disease\": \"15\",\n" +
            "\t\t\"language\": \"no\",\n" +
            "\t\t\"attended_school\": \"25\",\n" +
            "\t\t\"higher_education\": \"0\",\n" +
            "\t\t\"work_activity\": \"51\",\n" +
            "\t\t\"hours_worked\": \"0\",\n" +
            "\t\t\"employment_status\": \"217\",\n" +
            "\t\t\"survey_type\": \"0\",\n" +
            "\t\t\"survey_form_no\": \"sami_3\",\n" +
            "\t\t\"survey_uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_3\",\n" +
            "\t\t\"start\": \"2017-02-22 21:44:52\",\n" +
            "\t\t\"end\": \"2017-02-22 21:45:07\",\n" +
            "\t\t\"diff\": 15\n" +
            "\t}]\n" +
            "}, {\n" +
            "\t\"geographic_location\": {\n" +
            "\t\t\"region\": \"rural\",\n" +
            "\t\t\"province_id\": \"102\",\n" +
            "\t\t\"province_name\": \"BALUCHISTAN\",\n" +
            "\t\t\"district_id\": \"203\",\n" +
            "\t\t\"district_name\": \"KILLA SAIFULLAH\",\n" +
            "\t\t\"tehsil_id\": \"310\",\n" +
            "\t\t\"tehsil_name\": \"LOI BAND\",\n" +
            "\t\t\"uc_id\": \"464\",\n" +
            "\t\t\"uc_name\": \"LOI BAND\",\n" +
            "\t\t\"is_gps_exempted\": 0,\n" +
            "\t\t\"is_hard\": 0,\n" +
            "\t\t\"is_validate\": 0,\n" +
            "\t\t\"batch_size\": 1,\n" +
            "\t\t\"village_id\": \"3948\",\n" +
            "\t\t\"village_name\": \"kuram_training\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"po_id\": \"40\",\n" +
            "\t\t\"po_name\": \"GPO\"\n" +
            "\t},\n" +
            "\t\"contact_details\": {\n" +
            "\t\t\"total_rosters\": 0,\n" +
            "\t\t\"name_of_head\": \"tester\",\n" +
            "\t\t\"address_of_house\": \"qwerty\",\n" +
            "\t\t\"mobile_number\": \"12121221212\",\n" +
            "\t\t\"alternative_contact\": \"21212131313\",\n" +
            "\t\t\"mother_lang_id\": \"218\",\n" +
            "\t\t\"bisp_benificiary\": \"no\"\n" +
            "\t},\n" +
            "\t\"household_info\": {\n" +
            "\t\t\"occupacy_status\": \"63\",\n" +
            "\t\t\"wall_material\": \"68\",\n" +
            "\t\t\"roof_material\": \"73\",\n" +
            "\t\t\"cooking_fuel\": \"78\",\n" +
            "\t\t\"toilet\": \"85\",\n" +
            "\t\t\"drinking_water\": \"91\",\n" +
            "\t\t\"electricity\": \"102\",\n" +
            "\t\t\"gas\": \"105\",\n" +
            "\t\t\"landline\": \"108\",\n" +
            "\t\t\"land_unit\": \"0\",\n" +
            "\t\t\"number_of_rooms\": \"6\",\n" +
            "\t\t\"animal\": \"no\",\n" +
            "\t\t\"buffalo\": \"0\",\n" +
            "\t\t\"cow\": \"0\",\n" +
            "\t\t\"horse\": \"0\",\n" +
            "\t\t\"camel\": \"0\",\n" +
            "\t\t\"goat\": \"0\",\n" +
            "\t\t\"land_number\": \"0\",\n" +
            "\t\t\"household_agriculture_land\": \"no\",\n" +
            "\t\t\"heater\": \"no\",\n" +
            "\t\t\"washing_machine\": \"no\",\n" +
            "\t\t\"geyser\": \"no\",\n" +
            "\t\t\"air_cooler\": \"no\",\n" +
            "\t\t\"air_conditioner\": \"no\",\n" +
            "\t\t\"fan\": \"no\",\n" +
            "\t\t\"cooking_range\": \"no\",\n" +
            "\t\t\"cooking_stove\": \"no\",\n" +
            "\t\t\"tv\": \"no\",\n" +
            "\t\t\"vcr\": \"no\",\n" +
            "\t\t\"refrigerator\": \"no\",\n" +
            "\t\t\"freezer\": \"no\",\n" +
            "\t\t\"generator\": \"no\",\n" +
            "\t\t\"car\": \"no\",\n" +
            "\t\t\"mobile\": \"no\",\n" +
            "\t\t\"tractor\": \"no\",\n" +
            "\t\t\"motorcycle\": \"no\",\n" +
            "\t\t\"internet\": \"no\",\n" +
            "\t\t\"computer\": \"no\",\n" +
            "\t\t\"sewing\": \"no\"\n" +
            "\t},\n" +
            "\t\"miscellaneous\": {\n" +
            "\t\t\"taken_loan\": \"211\",\n" +
            "\t\t\"satisfaction_level\": \"178\",\n" +
            "\t\t\"resolve_complaint\": \"165\",\n" +
            "\t\t\"resolve_complaint_govt\": \"171\",\n" +
            "\t\t\"infant_death\": \"no\",\n" +
            "\t\t\"defence_job\": \"no\",\n" +
            "\t\t\"migration\": \"no\",\n" +
            "\t\t\"financial_assistance\": \"no\"\n" +
            "\t},\n" +
            "\t\"pictures\": {\n" +
            "\t\t\"image_benificiary_name\": \"benificiary_2017-02-22 21:46:15\",\n" +
            "\t\t\"image_benificiary\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\",\n" +
            "\t\t\"image_household_name\": \"household_2017-02-22 21:44:50\",\n" +
            "\t\t\"image_household\": \"/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\\nAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCACgAFoDASIA\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+BNc4\\nJ6bSq/Q5mHcZz8g+m47myHejpn8Mf8B3/X+6P/Hd27bzJUf65xj9PX+9zn6jG395kAOeQe2Of++x\\nzy3UIP1+8Q9Az83/AAD8MNIPl5zluc/xchd33qAPbn8e29V6N/s/h13Eq71JQBGMDdntj1/hZ+nP\\n8WTnnp3JLmnf/E+v/wBl+v8A49Tf5/5/Hr/nzKkoAZzjH49vXr9//J53bvmp9RjnP4fj/rAMYLen\\nPrh87sk1JQBH65x9fxYfxN/sd8892Dcgzz+X/jz99x759c9MNnIB0OPbrnHy+YP72O3bt/EwEhMl\\nADOcY/Ht69fv/wCTzu3fNS7h/krz1/2vof8AEk4aP4uem314O5x/e77c+oONxyd9SUAR9M//AFj/\\n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\\n\"\n" +
            "\t},\n" +
            "\t\"survey_information\": {\n" +
            "\t\t\"date\": \"2017-02-22\",\n" +
            "\t\t\"time\": \"21:46:22\",\n" +
            "\t\t\"start_time\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"end_time\": \"2017-02-22 21:46:22\",\n" +
            "\t\t\"imei_number\": \"DC:66:72:58:7E:BD\",\n" +
            "\t\t\"enumerator_name\": \"checker four\",\n" +
            "\t\t\"visit_status_id\": \"3\",\n" +
            "\t\t\"visit_status_reason\": \"\",\n" +
            "\t\t\"complete_form\": \"yes\",\n" +
            "\t\t\"average_roster_time\": 15,\n" +
            "\t\t\"uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_4\",\n" +
            "\t\t\"form_no\": \"sami_4\",\n" +
            "\t\t\"form_no_not_at_home\": \"\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"survey_accepted\": \"\",\n" +
            "\t\t\"validation_percentage\": \"0\",\n" +
            "\t\t\"survey_verified\": \"\",\n" +
            "\t\t\"batch_name\": \"1208_2017-02-22_13-43-21_bispData.json\",\n" +
            "\t\t\"is_selected_at_random\": 0,\n" +
            "\t\t\"is_selected_for_resurvey\": 0,\n" +
            "\t\t\"contact_detail_start\": \"2017-02-22 21:44:26\",\n" +
            "\t\t\"contact_detail_end\": \"2017-02-22 21:44:51\",\n" +
            "\t\t\"household_start\": \"2017-02-22 21:45:14\",\n" +
            "\t\t\"household_end\": \"2017-02-22 21:45:34\",\n" +
            "\t\t\"miscellaneous_start\": \"2017-02-22 21:45:35\",\n" +
            "\t\t\"miscellaneous_end\": \"2017-02-22 21:45:44\",\n" +
            "\t\t\"diff_contact_detail\": 25,\n" +
            "\t\t\"diff_household\": 20,\n" +
            "\t\t\"diff_miscellaneous\": 9\n" +
            "\t},\n" +
            "\t\"roster\": [{\n" +
            "\t\t\"roster_relational_id\": \"1\",\n" +
            "\t\t\"name_of_member\": \"tester\",\n" +
            "\t\t\"relation_to_household_id\": \"186\",\n" +
            "\t\t\"gender\": \"male\",\n" +
            "\t\t\"date_of_birth\": \"1 Feb 1999\",\n" +
            "\t\t\"date_of_birth_var\": \"1-2-1999\",\n" +
            "\t\t\"age_month\": 0,\n" +
            "\t\t\"age_year\": 18,\n" +
            "\t\t\"age\": 18,\n" +
            "\t\t\"merital_status\": \"200\",\n" +
            "\t\t\"cnic\": \"\",\n" +
            "\t\t\"cnic_option\": \"1\",\n" +
            "\t\t\"is_bisp_beneficiary\": \"\",\n" +
            "\t\t\"bform\": \"\",\n" +
            "\t\t\"id_spouse\": \"0\",\n" +
            "\t\t\"id_father\": \"-1\",\n" +
            "\t\t\"id_mother\": \"-1\",\n" +
            "\t\t\"respondant\": \"yes\",\n" +
            "\t\t\"disability\": \"6\",\n" +
            "\t\t\"chronic_disease\": \"15\",\n" +
            "\t\t\"language\": \"no\",\n" +
            "\t\t\"attended_school\": \"25\",\n" +
            "\t\t\"higher_education\": \"0\",\n" +
            "\t\t\"work_activity\": \"51\",\n" +
            "\t\t\"hours_worked\": \"0\",\n" +
            "\t\t\"employment_status\": \"217\",\n" +
            "\t\t\"survey_type\": \"0\",\n" +
            "\t\t\"survey_form_no\": \"sami_4\",\n" +
            "\t\t\"survey_uuid\": \"abcde4hb-4e35-4e25-8f09-04d5a73fee1d_4\",\n" +
            "\t\t\"start\": \"2017-02-22 21:44:52\",\n" +
            "\t\t\"end\": \"2017-02-22 21:45:07\",\n" +
            "\t\t\"diff\": 15\n" +
            "\t}]\n" +
            "}, {\n" +
            "\t\"geographic_location\": {\n" +
            "\t\t\"region\": \"rural\",\n" +
            "\t\t\"province_id\": \"102\",\n" +
            "\t\t\"province_name\": \"BALUCHISTAN\",\n" +
            "\t\t\"district_id\": \"203\",\n" +
            "\t\t\"district_name\": \"KILLA SAIFULLAH\",\n" +
            "\t\t\"tehsil_id\": \"310\",\n" +
            "\t\t\"tehsil_name\": \"LOI BAND\",\n" +
            "\t\t\"uc_id\": \"464\",\n" +
            "\t\t\"uc_name\": \"LOI BAND\",\n" +
            "\t\t\"is_gps_exempted\": 0,\n" +
            "\t\t\"is_hard\": 0,\n" +
            "\t\t\"is_validate\": 0,\n" +
            "\t\t\"batch_size\": 1,\n" +
            "\t\t\"village_id\": \"3948\",\n" +
            "\t\t\"village_name\": \"kuram_training\",\n" +
            "\t\t\"location\": \"31.4757771,74.3426506\",\n" +
            "\t\t\"location_accuracy\": \"10.0\",\n" +
            "\t\t\"po_id\": \"40\",\n" +
            "\t\t\"po_name\": \"GPO\"\n";

}
