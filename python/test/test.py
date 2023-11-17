import unittest

from python.src import main


class MyTestCase(unittest.TestCase):

    # 1을 받았을 때
    def test(self):
        case1 = 1
        self.assertEqual(main.look_and_say(case1), 11)

    # 11을 받았을 때
    def test2(self):
        case2 = 11
        self.assertEqual(main.look_and_say(case2), 21)

    # 21을 받았을 때
    def test3(self):
        case3 = 21
        self.assertEqual(main.look_and_say(case3), 1211)

    # 1211을 받았을 때
    def test4(self):
        case4 = 1211
        self.assertEqual(main.look_and_say(case4), 111221)

    # 111221을 받았을 때
    def test5(self):
        case5 = 111221
        self.assertEqual(main.look_and_say(case5), 312211)

    def test6(self):
        case6 = 312211
        self.assertEqual(main.look_and_say(case6), 13112221)

    def test7(self):
        case7 = 13112221
        self.assertEqual(main.look_and_say(case7), 1113213211)


if __name__ == '__main__':
    unittest.main()
